package com.github.xbest.structural.adapter.objectadapter;

/**
 * Created by link on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.doAdapteeSomething();
        target.doAdapterSomething();

        target = new Adapter();
        target.doAdapteeSomething();
        target.doAdapterSomething();
        target.doAnotherAdapteeSomething();
    }
}
