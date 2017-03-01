package com.github.xbest.structural.flyweight;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by link on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(20, 40, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(20));
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(2);
            threadPoolExecutor.execute(new TestThread("fly" + randomInt));
        }
    }

}
