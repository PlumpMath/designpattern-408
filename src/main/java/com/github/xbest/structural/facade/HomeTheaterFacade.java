package com.github.xbest.structural.facade;

/**
 * 外观模式，主要是通过composite即组合模式来实现的。<br/>
 * 其主旨思想，就是将多个相关的子系统合并到一块，提供一个完整通用的功能，<br/>
 * 客户端在调用外观模式封装的接口时，不用关心具体的细节。<br/>
 * Created by link on 2017/2/28.
 */
public class HomeTheaterFacade {
    private Audio audio;
    private Light light;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Audio audio, Light light, Projector projector, Screen screen) {
        this.audio = audio;
        this.light = light;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie() {
        this.audio.turnOn();
        this.light.turnOn();
        this.projector.turnOn();
        this.screen.turnOn();
        System.out.println("Everything is ready, enjoy your movie, please ...");
    }

    public void endMovie() {
        this.audio.turnOff();
        this.light.turnOff();
        this.projector.turnOff();
        this.screen.turnOff();
        System.out.println("Turn off all, you can go ...");
    }
}
