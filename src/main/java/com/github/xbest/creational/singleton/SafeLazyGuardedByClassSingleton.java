package com.github.xbest.creational.singleton;

/**
 * 通过方法加synchronized关键字来确保线程安全，实现简单，锁粒度较大，不推荐。
 * Created by link on 2017/2/22.
 */
public class SafeLazyGuardedByClassSingleton {
    private static SafeLazyGuardedByClassSingleton instance;

    private SafeLazyGuardedByClassSingleton() {

    }

    public static synchronized SafeLazyGuardedByClassSingleton getInstance() {
        if (instance == null) {
            instance = new SafeLazyGuardedByClassSingleton();
        }
        return instance;
    }
}
