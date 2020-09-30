package cn.txp.mybatis;
import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;
import cn.txp.mybatis.vo.News;

public class NewsSelect{
	@Test
	public void doCreate() {
		News news = MybatisFactory.getSqlSession().selectOne("cn.txp.mybatis.mapper.NewsNS.findById", 10L);
		System.out.println(news);
		MybatisFactory.close();
	}
}
