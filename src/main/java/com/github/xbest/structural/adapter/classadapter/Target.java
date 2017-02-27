package com.github.xbest.structural.adapter.classadapter;

/**
 * Created by link on 2017/2/27.
 */
public interface Target {
    /**
     * adaptee 原有的方法
     */
    void doAdapteeSomething();

    /**
     * adapter 新增方法
     */
    void doAdapterSomething();
}
