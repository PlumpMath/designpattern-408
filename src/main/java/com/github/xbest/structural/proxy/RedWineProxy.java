package com.github.xbest.structural.proxy;

/**
 * Created by link on 2017/3/1.
 */
public class RedWineProxy implements RedWine {
    private RedWine redWine = new RedWineFactory();

    @Override
    public void product() {
        this.redWine.product();
        System.out.println("Proxy produces red wine.");
    }

    @Override
    public void sell() {
        this.redWine.sell();
        System.out.println("Proxy sells red wine.");
    }
}
