package kz.onggar.pattern.abstractfactory;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;
import kz.onggar.pattern.abstractfactory.uicomponent.Label;
import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;

public class Main {
    public static void main(String[] args) {
        UserInterfaceAbstractFactory factory = new WindowsUserInterfaceFactory();
        show(factory);

        factory = new MacUserInterfaceFactory();
        show(factory);

        factory = new LinuxUserInterfaceFactory();
        show(factory);
    }

    static void show(UserInterfaceAbstractFactory factory) {
        Button button = factory.createButton();
        ScrollBar scrollBar = factory.createScrollBar();
        Window window = factory.createWindow();
        Label label = factory.createLabel();

        button.handleLeftClick();
        button.handleRightClick();

        scrollBar.scroll();

        label.setText("text");

        window.draw(button);
        window.draw(scrollBar);
        window.draw(label);
    }
}