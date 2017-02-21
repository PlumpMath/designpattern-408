package com.github.xbest.creational.abstractfactory;

/**
 * 抽象工厂模式和工厂方法模式是比较绕的两种模式，<br />
 * 在查阅了stackoverflow、headfirst以及其它Google abstract factory vs factory method资料后，<br />
 * 觉得上面都解释的不是很清楚，包括headfirst即使给出了定义，个人也还不是太明白。<br />
 * <p>
 * <strong>Head First Official Definition</strong> <br />
 * The Abstract Factory Pattern provides an interface
 * for creating families of related or dependent objects without specifying their concrete classes.<br/>
 * The Factory Method Pattern defines an interface
 * for creating an object, but lets subclasses decide which
 * class to instantiate. Factory Method lets a class defer
 * instantiation to subclasses.
 * <p>
 * 现在回过头来看上面headfirst给出的定义，稍微有点明白。<br/>
 * 抽象工厂其实是定义了一个产品，然而这个产品有很多元素组成，并不是网上举例子的海尔和海信有冰箱、洗衣机等系列，
 * 而是说某个产品，例如汽车由发动机、轮胎、车架、车窗等组成，这里面的各个组件就是headfirst中所说的related or dependent objects，
 * 代码中的Car中的engine、tire、frame、window其实应该定义为class，此处偷懒没有定义，故对应headfirst中的without specifying their concrete classes，
 * 因为在具体工厂类中已经指定了这些如何初始化，所以客户端只需要知道用哪个具体工厂类去指导组装汽车即可。
 * <p>
 * 工厂方法模式其实在实际项目应用更多，因为他指定了让子类去实现具体的实现，足够简单。当然实际应用中，可能会对某个模式进行变通，
 * 并不一定严格遵守这些模式，但是其中的思想和方法都是共通的。例如spring的BeanFactory、Calender等。
 * <p>
 * Created by link on 2017/2/21.
 */
public interface AssembleFactory {
    String assembleEngine();

    String assembleTire();

    String assembleFrame();

    String assembleWindow();
}
