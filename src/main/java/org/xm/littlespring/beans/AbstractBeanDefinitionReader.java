package org.xm.littlespring.beans;

import org.xm.littlespring.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 从配置读取BeanDefinition
 * @author xuming
 */
public abstract class AbstractBeanDefinitionReader  implements BeanDefinitionReader{
    private Map<String,BeanDefinition> registry;
    private ResourceLoader resourceLoader;
    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<String,BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }
    public Map<String,BeanDefinition> getRegistry(){
        return registry;
    }
    public ResourceLoader getResourceLoader(){
        return resourceLoader;
    }

}
