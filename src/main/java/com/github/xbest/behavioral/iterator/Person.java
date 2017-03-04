package com.github.xbest.behavioral.iterator;

/**
 * Created by link on 2017/3/4.
 */
public class Person {
    protected String name;
    /**
     * 0-male,1-female
     */
    protected int gender;
    protected int age;

    public Person(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
