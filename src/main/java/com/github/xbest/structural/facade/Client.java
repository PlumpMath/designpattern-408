package com.github.xbest.structural.facade;

/**
 * Created by link on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Light light = new Light();
        Projector projector = new Projector();
        Screen screen = new Screen();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(audio, light, projector, screen);
        homeTheaterFacade.watchMovie();
        System.out.println("after a boring hour ...");
        homeTheaterFacade.endMovie();
    }
}
