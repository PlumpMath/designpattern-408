package com.github.xbest.creational.singleton;

/**
 * 推荐，虽然耗费一点空间，但是逻辑简单不易出错。<br/>
 * {@link Runtime#getRuntime()}中就是应用的此类单例模式。
 * Created by link on 2017/2/22.
 */
public class SafeEarlySingleton {
    private static final SafeEarlySingleton instance = new SafeEarlySingleton();

    private SafeEarlySingleton() {

    }

    public static SafeEarlySingleton getInstance() {
        return instance;
    }
}
