package kz.onggar.pattern.command.command;

import kz.onggar.pattern.command.Command;
import kz.onggar.pattern.command.TV;

public class TVOnCommand implements Command {
    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
