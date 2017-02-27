package com.github.xbest.structural.adapter.objectadapter;

/**
 * 对象适配模式，可以适配多个原有接口，但是在适配多个接口时，会违反开闭原则和单一职责。<br />
 * 如果要对接多个接口，建议实现默认适配器类，实现所有空方法。
 * Created by link on 2017/2/27.
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    private AnotherAdaptee anotherAdaptee;

    public Adapter() {
        this(new Adaptee(), new AnotherAdaptee());
    }

    public Adapter(Adaptee adaptee) {
        this(adaptee, null);
    }

    public Adapter(AnotherAdaptee anotherAdaptee) {
        this(null, anotherAdaptee);
    }

    public Adapter(Adaptee adaptee, AnotherAdaptee anotherAdaptee) {
        this.adaptee = adaptee;
        this.anotherAdaptee = anotherAdaptee;
    }

    @Override
    public void doAdapteeSomething() {
        adaptee.doAdapteeSomething();
    }

    @Override
    public void doAnotherAdapteeSomething() {
        anotherAdaptee.doAdapteeSomething();
    }

    @Override
    public void doAdapterSomething() {
        System.out.println("adapter do something...");
    }
}
