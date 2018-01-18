package cn.itcast.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	@Test
	public void testUser() {
		// 1.加载spring 配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean1.xml");
		// 2 得到配置创建的对象
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
	}
}
