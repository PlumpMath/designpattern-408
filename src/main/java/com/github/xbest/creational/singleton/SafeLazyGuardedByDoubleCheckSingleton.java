package com.github.xbest.creational.singleton;

/**
 * Double-Check来确保线程安全，相对于在方法上加synchronized关键字来说减小了锁粒度，但是实现逻辑较为复杂，不推荐。<br />
 * 其中，网上很多例子包括headfirst在内instance上都加了volatile关键字，但是其实不用添加就可以保证。
 * Created by link on 2017/2/22.
 */
public class SafeLazyGuardedByDoubleCheckSingleton {
    // 此处不需要添加volatile关键字，因为synchronized已经保证了可见性
    private static SafeLazyGuardedByDoubleCheckSingleton instance;

    private SafeLazyGuardedByDoubleCheckSingleton() {
    }

    public static SafeLazyGuardedByDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (SafeLazyGuardedByDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new SafeLazyGuardedByDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
