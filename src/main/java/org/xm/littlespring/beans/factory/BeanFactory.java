package org.xm.littlespring.beans.factory;

/**
 * @author xuming
 */
public interface BeanFactory {
    Object getBean(String name)throws Exception;
}
