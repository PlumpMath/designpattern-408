package com.github.xbest.creational.abstractfactory;

/**
 * Created by link on 2017/2/21.
 */
public class BenzCar extends Car {

    public BenzCar(AssembleFactory assembleFactory) {
        this.assembleFactory = assembleFactory;
        assemble();
    }

    @Override
    protected void assemble() {
        engine = assembleFactory.assembleEngine();
        tire = assembleFactory.assembleTire();
        frame = assembleFactory.assembleFrame();
        window = assembleFactory.assembleWindow();
    }

    @Override
    public String toString() {
        return "BenzCar{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", frame='" + frame + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
