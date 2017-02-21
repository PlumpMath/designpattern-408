package com.github.xbest.creational.abstractfactory;

/**
 * Created by link on 2017/2/21.
 */
public class BenzAssembleFactory implements AssembleFactory  {
    @Override
    public String assembleEngine() {
        return "Benz engine";
    }

    @Override
    public String assembleTire() {
        return "Benz tire";
    }

    @Override
    public String assembleFrame() {
        return "Benz frame";
    }

    @Override
    public String assembleWindow() {
        return "Benz window";
    }
}
