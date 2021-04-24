package kz.onggar.pattern.command;

import kz.onggar.pattern.command.command.TVSoundIncreaseCommand;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        Command increaseSoundCommand = new TVSoundIncreaseCommand(tv);
        increaseSoundCommand.execute();
        increaseSoundCommand.execute();
    }
}
