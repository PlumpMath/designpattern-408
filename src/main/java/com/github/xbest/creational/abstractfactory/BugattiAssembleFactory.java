package com.github.xbest.creational.abstractfactory;

/**
 * Created by link on 2017/2/21.
 */
public class BugattiAssembleFactory implements AssembleFactory  {
    @Override
    public String assembleEngine() {
        return "Bugatti engine";
    }

    @Override
    public String assembleTire() {
        return "Bugatti tire";
    }

    @Override
    public String assembleFrame() {
        return "Bugatti frame";
    }

    @Override
    public String assembleWindow() {
        return "Bugatti window";
    }
}
