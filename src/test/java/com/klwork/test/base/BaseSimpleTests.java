/**
 *
 */
package com.klwork.test.base;

import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 测试基类事务回滚
 */
@ContextConfiguration(locations = {"classpath:/spring-config/applicationContextTest.xml"})
public class BaseSimpleTests extends AbstractJUnit4SpringContextTests {
    protected static Logger logger = Logger.getLogger(BaseSimpleTests.class);


}
