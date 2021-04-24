package kz.onggar.pattern.command.command;

import kz.onggar.pattern.command.Command;
import kz.onggar.pattern.command.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
