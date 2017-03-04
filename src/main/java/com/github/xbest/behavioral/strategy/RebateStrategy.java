package com.github.xbest.behavioral.strategy;

/**
 * Created by link on 2017/3/4.
 */
public class RebateStrategy implements Strategy {
    private final double RATE = 0.8;

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.RATE;
    }
}
