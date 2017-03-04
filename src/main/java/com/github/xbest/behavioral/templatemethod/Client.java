package com.github.xbest.behavioral.templatemethod;

/**
 * Created by link on 2017/3/4.
 */
public class Client {

    public static void main(String[] args) {
        AbstractPeople people;
        people = new Worker();
        people.dailyLife();
        people = new Boss();
        people.dailyLife();
    }
}
