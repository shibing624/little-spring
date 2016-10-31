package org.xm.littlespring.aop;

/**
 * @author xuming
 */
public abstract class AbstractAopProxy implements AopProxy{
    protected AdvisedSupport advised;
    public AbstractAopProxy(AdvisedSupport advised){
        this.advised = advised;
    }
}
