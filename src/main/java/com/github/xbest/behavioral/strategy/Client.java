package com.github.xbest.behavioral.strategy;

import java.util.Random;

/**
 * Created by link on 2017/3/4.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy;
        double consumePrice = new Random().nextInt(2000);
        StrategyContext strategyContext = new StrategyContext();

        System.out.printf("The consume price is %s.%n", consumePrice);

        strategy = new RebateStrategy();
        strategyContext.setStrategy(strategy);
        System.out.printf("Rebate strategy's real price is %s.%n", strategyContext.calculatorPrice(consumePrice));

        strategy = new ReduceStrategy();
        strategyContext.setStrategy(strategy);
        System.out.printf("Reduce strategy's real price is %s.%n", strategyContext.calculatorPrice(consumePrice));

        strategy = new PromotionalStrategy();
        strategyContext.setStrategy(strategy);
        System.out.printf("Promotional strategy's real price is %s.%n", strategyContext.calculatorPrice(consumePrice));
    }
}
