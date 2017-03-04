package com.github.xbest.behavioral.templatemethod;

/**
 * Created by link on 2017/3/4.
 */
public class Boss extends AbstractPeople {
    @Override
    protected void transport() {
        System.out.println("The boss drives a car to company.");
    }

    @Override
    protected void haveBreakfast() {
        System.out.println("The boss have meal, vegetables, bread and milk for breakfast.");
    }
}
