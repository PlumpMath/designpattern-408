package com.github.xbest.behavioral.templatemethod;

import java.util.concurrent.locks.*;

/**
 * 模板方法模式，定义一个完整的过程或者步骤，一次性实现一个算法或者流程的不变部分，将可变的行为留给子类去实现。<br/>
 * 在设计系统时，会遇到一些有顺序的执行步骤，共同完成一件事情，那么这时候可以使用模板方法模式。<br/>
 * 父类定义了流程处理逻辑（即先执行methodA再执行methodB），提供一个按照正确顺序去调用他们的具体方法；<br/>
 * 子类通过继承父类去实现各个步骤的抽象方法。<br/>
 * jdk中的典型应用为{@link AbstractQueuedSynchronizer#acquire(int)}和{@link AbstractQueuedSynchronizer#tryAcquire(int)}<br/>
 * tryAcquire由子类去实现，例如{@link ReentrantLock.Sync#tryAcquire(int)}<br/>
 * Created by link on 2017/3/4.
 */
public abstract class AbstractPeople {
    public final void dailyLife() {
        System.out.println("========What a lovely day start========");
        getUp();
        haveBreakfast();
        transport();
        doWork();
        System.out.println("========What a lovely day end========");
    }

    public void doWork() {
        System.out.println("working hard...");
    }

    protected abstract void transport();

    protected abstract void haveBreakfast();

    public void getUp() {
        System.out.println("get up...");
    }
}
