package kz.onggar.pattern.command.command;

import kz.onggar.pattern.command.Command;
import kz.onggar.pattern.command.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
