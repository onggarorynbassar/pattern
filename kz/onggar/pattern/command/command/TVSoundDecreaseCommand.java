package kz.onggar.pattern.command.command;

import kz.onggar.pattern.command.Command;
import kz.onggar.pattern.command.TV;

public class TVSoundDecreaseCommand implements Command {
    private final TV tv;

    public TVSoundDecreaseCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if (!tv.isSwitchedOn()) {
            tv.on();
        }
        tv.increaseSound();
    }
}
