package org.xm.littlespring.aop;

/**
 * @author xuming
 */
public interface ClassFilter {
    boolean matches(Class targetClass);
}
