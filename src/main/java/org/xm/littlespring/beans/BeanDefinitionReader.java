package org.xm.littlespring.beans;

/**
 * 从配置中读取BeanDefinition
 * @author xuming
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location)throws Exception;
}
