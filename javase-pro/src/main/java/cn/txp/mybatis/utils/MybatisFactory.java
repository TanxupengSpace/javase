package cn.txp.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisFactory {
	private static final String MYBATIS_CFG = "mybatis/mybatis.cfg.xml";
	private static SqlSessionFactory sqlSessionFactory;
	private static final ThreadLocal<SqlSession> THREAD_LOCAL_SQLSESSION = new ThreadLocal<SqlSession>();
	/**
	 * ����������ݿ����������������
	 */
	private static SqlSessionFactory buildSqlSessionFactory() {
		try {
			InputStream input = Resources.getResourceAsStream(MYBATIS_CFG);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
	/**
	 * �����ȡ���ݿ����Ӷ���
	 * @return
	 */
	public static SqlSession getSqlSession() {
		SqlSession sqlSession = THREAD_LOCAL_SQLSESSION.get();
		if(sqlSession == null) {
			sqlSession = buildSqlSessionFactory().openSession();
			THREAD_LOCAL_SQLSESSION.set(sqlSession);
		}
		return sqlSession;
	}
	/**
	 * ����������ݿ�Ĺرղ���
	 */
	public static void close() {
		SqlSession sqlSession = THREAD_LOCAL_SQLSESSION.get();
		if(sqlSession != null) {
			sqlSession.close();
		}
		THREAD_LOCAL_SQLSESSION.remove();
	}
}
