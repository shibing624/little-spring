package org.xm.littlespring.context;

import org.junit.Test;
import org.xm.littlespring.HelloWorldService;

/**
 * @author xuming
 */
public class ApplicationContextTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("littlespring.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}