package org.xm.littlespring.aop;

import org.xm.littlespring.beans.factory.BeanFactory;

/**
 * @author xuming
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory)throws Exception;
}
