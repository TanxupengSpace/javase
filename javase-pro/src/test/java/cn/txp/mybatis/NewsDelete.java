package cn.txp.mybatis;
import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;


public class NewsDelete{
	@Test
	public void doRemove() {
		MybatisFactory.getSqlSession().delete("cn.txp.mybatis.mapper.NewsNS.doRemove", 15L);
		MybatisFactory.getSqlSession().commit();
		MybatisFactory.getSqlSession().close();
	}
}
