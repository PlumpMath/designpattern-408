package com.github.xbest.creational.simplefactory;

/**
 * Created by link on 2017/2/20.
 */
public class Client {
    public static void main(String[] args) {
        SimpleProduct simpleProduct = SimpleProductFactory.getInstance("productA");
        simpleProduct.showProductInformation();
        simpleProduct = SimpleProductFactory.getInstance("productB");
        simpleProduct.showProductInformation();
    }
}
