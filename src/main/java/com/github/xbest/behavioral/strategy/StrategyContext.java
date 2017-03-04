package com.github.xbest.behavioral.strategy;

import java.math.BigDecimal;

/**
 * Created by link on 2017/3/4.
 */
public class StrategyContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculatorPrice(double consumePrice) {
        double realPrice = this.strategy.realPrice(consumePrice);
        BigDecimal bigDecimal = new BigDecimal(realPrice);
        bigDecimal = bigDecimal.setScale(1, BigDecimal.ROUND_DOWN);
        return bigDecimal.doubleValue();
    }
}
