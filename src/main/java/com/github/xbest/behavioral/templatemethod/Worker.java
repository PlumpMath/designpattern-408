package com.github.xbest.behavioral.templatemethod;

/**
 * Created by link on 2017/3/4.
 */
public class Worker extends AbstractPeople {

    @Override
    protected void transport() {
        System.out.println("The worker go to work by bus.");
    }

    @Override
    protected void haveBreakfast() {
        System.out.println("The worker have bread and egg for breakfast.");
    }
}
