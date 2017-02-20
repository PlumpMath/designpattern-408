package com.github.xbest.creational.factorymethod;

import java.util.Collection;

/**工厂方法模式，不再负责维护创建对象的逻辑，将创建对象的任务委托给子类去显示，符合单一职责。<br />
 * 针对更换产品来说，由于在子工厂中负责创建，所以仍需修改子工厂逻辑，所以并未符合开闭原则。<br />
 * 多态性是工厂方法模式的关键，所以又叫多态工厂模式。<br />
 * 增加新产品时，无需修改已有的产品体系，直接新增产品和产品子工厂就可以。<br />
 * 由于每次新增产品需要新增产品及子工厂，所以会造成类的庞大和复杂。<br />
 * JDK中的{@link Collection#iterator()}使用了工厂方法模式。<br />
 * Created by link on 2017/2/20.
 */
public interface ShapeFactory {
    Shape createShape();
}
