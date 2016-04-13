package com.klwork.test.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/spring-config/applicationContextTest.xml"})
public abstract class BaseTxTests extends
		AbstractTransactionalJUnit4SpringContextTests {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	public BaseTxTests() {

	}

	/**
	 * 刷新session
	 */
	private void flushSession() {
		SqlSessionFactory sessionFactory = (SqlSessionFactory) applicationContext
				.getBean("sqlSessionFactory");
		sessionFactory.openSession().commit();

	}

	protected static boolean isTest = false;

	/**
	 * 执行此方法后将会把测试数据写进数据库
	 */
	public void flushToDataBase() {
		if (!isTest) {
			flushSession();
			// setComplete();
		}
	}

	/**
	 * 
	 * 创建用户及用户的team 用户：testUser1 team： develop,weibo
	 * develop[testuser2,testuser3], weibo[testuser2,testuser4]
	 * 
	 * testuser3 team: sales, sales[testuser4]
	 */
	protected void intTestUser() {

	}
}