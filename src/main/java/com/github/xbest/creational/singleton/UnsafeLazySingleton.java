package com.github.xbest.creational.singleton;

/**
 * Created by link on 2017/2/22.
 */
public class UnsafeLazySingleton {
    private static UnsafeLazySingleton instance;

    private UnsafeLazySingleton() {

    }

    public static UnsafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeLazySingleton();
        }
        return instance;
    }

}
