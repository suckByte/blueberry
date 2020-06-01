package blueberry;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.blueberry.pojo.User;
import com.blueberry.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class);

	@Resource
	private ITestService itestService = null;

	@Test
	public void test1() {
		User user = itestService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
