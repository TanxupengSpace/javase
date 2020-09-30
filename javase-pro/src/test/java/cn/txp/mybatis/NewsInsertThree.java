package cn.txp.mybatis;
import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;
import cn.txp.mybatis.vo.News;

public class NewsInsertThree{
	@Test
	public void doCreate() {
		News news = new News();
		news.setTitle("Mybatis������");
		news.setContent("Mybatis������ʹ��");
		MybatisFactory.getSqlSession().insert("cn.txp.mybatis.mapper.NewsNS.doCreateTow", news);
		System.out.println(news.getNid());
		MybatisFactory.getSqlSession().commit();
		MybatisFactory.close();
	}
}