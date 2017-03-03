package com.github.xbest.behavioral.observer;

import java.util.*;

/**
 * 观察者模式，定义了对象间的一种一对多的依赖关系，<br/>
 * 当一个对象发生改变时，所有依赖于它的对象都得到通知并自动更新。<br/>
 * 在写中介者模式时，就提到中介者模式和观察者模式很类似。<br/>
 * 两者的不同之处在于，观察者模式强调的是一个的改变引起其他的改变，<br/>
 * 而中介者模式强调的是协调多个对象，作为中间的一个传递媒介作用。<br/>
 * 观察者模式在jdk中的典型应用就是{@link Observable}和{@link Observer}<br/>
 * 本示例代码也是参考jdk中的代码所写的。<br/>
 * Created by link on 2017/3/4.
 */
public class Observable {
    private Vector<Observer> observers;
    private volatile boolean changed = false;

    public Observable() {
        this.observers = new Vector<>();
    }

    public synchronized void addObserver(Observer observer) {
        Objects.requireNonNull(observer);
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public synchronized void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public synchronized void deleteObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public synchronized void notifyObservers(Object arg) {
        if (this.changed) {
            for (Observer observer : observers) {
                observer.update(this, arg);
            }
            clearChange();
        }
    }

    public synchronized void setChanged() {
        this.changed = true;
    }

    private synchronized void clearChange() {
        this.changed = false;
    }

}
