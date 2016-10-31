package org.xm.littlespring.aop;

/**
 * @author xuming
 */
public interface Pointcut {
    ClassFilter getClassFilter();
    MethodMatcher getMethodMatcher();
}
