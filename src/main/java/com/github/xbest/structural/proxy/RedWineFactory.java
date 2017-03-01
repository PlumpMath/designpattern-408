package com.github.xbest.structural.proxy;

/**
 * Created by link on 2017/3/1.
 */
public class RedWineFactory implements RedWine {
    @Override
    public void product() {
        System.out.println("Factory produces red wine.");
    }

    @Override
    public void sell() {
        System.out.println("Factory sells red wine.");
    }
}
