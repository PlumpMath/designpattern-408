package com.github.xbest.behavioral.observer;

/**
 * Created by link on 2017/3/4.
 */
public class Client {
    public static void main(String[] args) {
        UpdateArg updateArg = new UpdateArg("1", "I am No.1.");
        Observable observable = new Observable();

        Observer x = new XObserver();
        Observer y = new YObserver();

        observable.addObserver(x);
        observable.addObserver(y);

        observable.setChanged();
        observable.notifyObservers(updateArg);

        observable.setChanged();
        observable.notifyObservers();
    }
}
