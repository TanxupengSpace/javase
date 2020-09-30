package cn.txp.mybatis;
import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;
import cn.txp.mybatis.vo.News;

public class NewsUpdate{
	@Test
	public void doCreate() {
		News news = new News();
		news.setNid(10L);
		news.setTitle("�޸Ĳ���");
		news.setContent("�޸���������");
		MybatisFactory.getSqlSession().insert("cn.txp.mybatis.mapper.NewsNS.doUpdate", news);
		MybatisFactory.getSqlSession().commit();
		MybatisFactory.close();
	}
}
