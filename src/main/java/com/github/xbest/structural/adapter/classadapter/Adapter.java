package com.github.xbest.structural.adapter.classadapter;

/**适配器模式，主要用于和遗留系统或者接口对接使用，对某些不方便重构的接口增加或者扩展功能，使其能够使用。<br />
 * 此处实现是类适配器模式，可以扩展某个原有接口。
 * Created by link on 2017/2/27.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void doAdapteeSomething() {
        super.doAdapteeSomething();
        System.out.println("adapter do adaptee something...");
    }
    @Override
    public void doAdapterSomething() {
        System.out.println("adapter do something...");
    }
}
