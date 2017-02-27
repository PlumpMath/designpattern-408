package com.github.xbest.structural.adapter.classadapter;

/**
 * Created by link on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.doAdapterSomething();
        adapter.doAdapteeSomething();
    }
}
