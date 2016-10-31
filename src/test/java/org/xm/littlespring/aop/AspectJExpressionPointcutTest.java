package org.xm.littlespring.aop;

import org.junit.Assert;
import org.junit.Test;
import org.xm.littlespring.HelloWorldService;
import org.xm.littlespring.HelloWorldServiceImpl;

/**
 * @author xuming
 */
public class AspectJExpressionPointcutTest {
    @Test
    public void getClassFilter() throws Exception {
        String expression = "execution(* org.xm.littlespring.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void getMethodMatcher() throws Exception {
        String expression = "execution(* org.xm.littlespring.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceImpl.class);
        Assert.assertTrue(matches);
    }

}