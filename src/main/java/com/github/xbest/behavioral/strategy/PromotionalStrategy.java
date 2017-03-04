package com.github.xbest.behavioral.strategy;

/**
 * Created by link on 2017/3/4.
 */
public class PromotionalStrategy implements Strategy {
    private final double SUM_PRICE = 200;
    private final double RATE = 0.8;

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice > SUM_PRICE ? (consumePrice - SUM_PRICE) * RATE + SUM_PRICE : consumePrice;
    }
}
