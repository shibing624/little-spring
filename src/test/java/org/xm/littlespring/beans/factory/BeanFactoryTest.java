package org.xm.littlespring.beans.factory;

import org.junit.Test;
import org.xm.littlespring.beans.BeanDefinition;
import org.xm.littlespring.HelloWorldService;
import org.xm.littlespring.beans.io.ResourceLoader;
import org.xm.littlespring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author xuming
 */
public class BeanFactoryTest {
    @Test
    public void getBean() throws Exception {
        // 1.read xml
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("littlespring.xml");

        // 2.init bean factory and register
        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String,BeanDefinition> beanDefinitionEntry: xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(),beanDefinitionEntry.getValue());
        }

        // 3.get bean
        HelloWorldService helloWordService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWordService.helloWorld();
    }

}