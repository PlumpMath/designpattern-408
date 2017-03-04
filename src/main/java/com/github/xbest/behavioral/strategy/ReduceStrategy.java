package com.github.xbest.behavioral.strategy;

/**
 * Created by link on 2017/3/4.
 */
public class ReduceStrategy implements Strategy {
    private final double REDUCE_PRICE = 200;
    private final double SUM_PRICE = 1000;

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice > SUM_PRICE ? consumePrice - REDUCE_PRICE : consumePrice;
    }
}
