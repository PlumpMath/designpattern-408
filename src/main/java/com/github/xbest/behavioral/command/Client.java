package com.github.xbest.behavioral.command;

/**
 * Created by link on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        command.execute();
        command = new LightOffCommand(light);
        command.execute();

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.addCommand(new LightOffCommand(light));
        commandExecutor.addCommand(new LightOnCommand(light));
        commandExecutor.executeCommand();
    }
}
