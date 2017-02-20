package com.github.xbest.factory;

/**简单工厂模式，适合逻辑不是特别复杂的对象创建，工厂含有对象创建逻辑。
 * 客户端无需关心对象创建细节，只需要知道对象参数即可。
 * 由于对象的创建在简单工厂类中，所以违背了单一职责和开闭原则。
 * JDK中加密算法密钥生成器、DateFormat等采用此模式。
 *
 * Created by link on 2017/2/17.
 */
public class SimpleProductFactory {
    public static AbstractSimpleProduct getInstance(String name) {
        AbstractSimpleProduct product = null;
        if ("productA".equals(name)) {
            product = new SimpleProductA();
        } else if ("productB".equals(name)) {
            product = new SimpleProductB();
        }
        return product;
    }
}
