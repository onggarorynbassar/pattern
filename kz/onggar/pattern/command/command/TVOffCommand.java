package kz.onggar.pattern.command.command;

import kz.onggar.pattern.command.Command;
import kz.onggar.pattern.command.Light;
import kz.onggar.pattern.command.TV;

public class TVOffCommand implements Command {
    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
