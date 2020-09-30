package cn.txp.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.txp.mybatis.vo.News;

public class NewsInsert{
	@Test
	public void doCreate() {
		try {
			InputStream input = Resources.getResourceAsStream("mybatis/mybatis.cfg.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
			SqlSession session = sessionFactory.openSession();
			News news = new News();
			news.setTitle("新闻名称");
			news.setContent("新闻内容");
			System.out.println(session.insert("cn.txp.mybatis.mapper.NewsNS.doCreate", news));
			session.commit();
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
