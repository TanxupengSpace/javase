package cn.txp.mybatis;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.txp.mybatis.utils.MybatisFactory;
import cn.txp.mybatis.vo.News;

public class NewsSelect3{
	@Test
	public void doCreate() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("column", "title");
		map.put("keyWord", "Mybat%");
		List<News> allNews = MybatisFactory.getSqlSession().selectList("cn.txp.mybatis.mapper.NewsNS.findAll");
		System.out.println(allNews);
		MybatisFactory.getSqlSession().close();
	}
}
