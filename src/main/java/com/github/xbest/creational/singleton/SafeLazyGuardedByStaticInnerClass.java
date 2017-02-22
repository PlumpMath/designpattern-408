package com.github.xbest.creational.singleton;

/**
 * 推荐，通过内部类的机制，由jvm确保线程安全，并且实现懒加载。
 * Created by link on 2017/2/22.
 */
public class SafeLazyGuardedByStaticInnerClass {
    private SafeLazyGuardedByStaticInnerClass() {

    }

    public SafeLazyGuardedByStaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final SafeLazyGuardedByStaticInnerClass INSTANCE = new SafeLazyGuardedByStaticInnerClass();
    }
}
