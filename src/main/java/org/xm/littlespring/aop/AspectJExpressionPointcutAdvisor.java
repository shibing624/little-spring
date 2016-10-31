package org.xm.littlespring.aop;

import org.aopalliance.aop.Advice;

/**
 * @author xuming
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor{

    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    private Advice advice;

    public void setPointcut(AspectJExpressionPointcut pointcut) {
        this.pointcut = pointcut;
    }

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }
}
