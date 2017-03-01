package com.github.xbest.structural.proxy;

/**
 * Created by link on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        RedWine redWineProxy = new RedWineProxy();
        redWineProxy.product();
        redWineProxy.sell();
    }
}
