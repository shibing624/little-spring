package org.xm.littlespring.beans;

import java.util.Map;

/**
 * 从配置读取BeanDefinition
 * @author xuming
 */
public abstract class AbstractBeanDefinitionReader  implements BeanDefinitionReader{
    private Map<String,BeanDefinition> registry;


}
