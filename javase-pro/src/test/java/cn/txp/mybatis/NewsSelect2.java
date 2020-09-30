package cn.txp.mybatis;
import java.util.List;

import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;
import cn.txp.mybatis.vo.News;

public class NewsSelect2{
	@Test
	public void doCreate() {
		List<News> allNews = MybatisFactory.getSqlSession().selectList("cn.txp.mybatis.mapper.NewsNS.findAll");
		System.out.println(allNews);
		MybatisFactory.getSqlSession().close();
	}
}
