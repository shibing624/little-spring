package org.xm.littlespring.beans.xml;

import org.junit.Assert;
import org.xm.littlespring.beans.BeanDefinition;
import org.xm.littlespring.beans.io.ResourceLoader;

import java.util.Map;

/**
 * @author xuming
 */
public class XmlBeanDefinitionReaderTest {

    @org.junit.Test
    public void registerBeanDefinitioins() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("littlespring.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        System.out.println(registry.keySet().toString());
        Assert.assertTrue(registry.size() > 0);
    }

}