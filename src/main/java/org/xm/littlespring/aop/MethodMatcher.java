package org.xm.littlespring.aop;

import java.lang.reflect.Method;

/**
 * @author xuming
 */
public interface MethodMatcher {
    boolean matches(Method method, Class targetClass);
}
