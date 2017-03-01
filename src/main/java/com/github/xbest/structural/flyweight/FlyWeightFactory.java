package com.github.xbest.structural.flyweight;

import sun.text.resources.cldr.yav.FormatData_yav;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by link on 2017/2/28.
 */
public class FlyWeightFactory {
    private static final Map<String, FlyWeight> FLY_WEIGHT_HASH_MAP = new ConcurrentHashMap<>();

    public static FlyWeight getFlyWeight(String name) {
        FlyWeight flyWeight = FLY_WEIGHT_HASH_MAP.get(name);
        if (Objects.isNull(flyWeight)) {
            synchronized (FLY_WEIGHT_HASH_MAP) {
                flyWeight = FLY_WEIGHT_HASH_MAP.get(name);
                if (Objects.isNull(flyWeight)) {
                    flyWeight = new ConcreteFlyweight(name);
                    FLY_WEIGHT_HASH_MAP.put(name, flyWeight);
                }
            }
        }
        return flyWeight;
    }
}
