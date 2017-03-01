package com.github.xbest.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by link on 2017/3/1.
 */
public class CommandExecutor {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        Objects.requireNonNull(command);
        commands.add(command);
    }

    public void executeCommand() {
        commands.forEach(Command::execute);
    }
}
