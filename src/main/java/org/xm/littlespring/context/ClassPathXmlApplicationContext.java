package org.xm.littlespring.context;


import org.xm.littlespring.beans.BeanDefinition;
import org.xm.littlespring.beans.factory.AbstractBeanFactory;
import org.xm.littlespring.beans.factory.AutowireCapableBeanFactory;
import org.xm.littlespring.beans.io.ResourceLoader;
import org.xm.littlespring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

	private String configLocation;

	public ClassPathXmlApplicationContext(String configLocation) throws Exception {
		this(configLocation, new AutowireCapableBeanFactory());
	}

	public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
		super(beanFactory);
		this.configLocation = configLocation;
		refresh();
	}

	@Override
	protected void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
		for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
			beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}
	}

}
