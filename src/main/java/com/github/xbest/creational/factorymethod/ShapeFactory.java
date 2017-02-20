package com.github.xbest.creational.factorymethod;

/**工厂方法模式，不再负责维护创建对象的逻辑，将创建对象的任务委托给子类去显示，符合开闭原则和单一职责。
 * 多态性是工厂方法模式的关键，所以又叫多态工厂模式。
 * 增加新产品时，无需修改已有的产品体系，直接新增产品和产品子工厂就可以。
 * 由于每次新增产品需要新增产品及子工厂，所以会造成类的庞大和复杂。
 * Created by link on 2017/2/20.
 */
public interface ShapeFactory {
    Shape createShape();
}
