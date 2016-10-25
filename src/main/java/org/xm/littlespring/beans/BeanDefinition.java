package org.xm.littlespring.beans;

/**
 * @author xuming
 */
public class BeanDefinition {
    private Object bean;
    private Class beanClass;
    private String beanClassName;
    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition() {

    }
}