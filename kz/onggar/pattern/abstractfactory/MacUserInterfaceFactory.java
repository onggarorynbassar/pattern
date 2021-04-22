package kz.onggar.pattern.abstractfactory;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;
import kz.onggar.pattern.abstractfactory.uicomponent.Label;
import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;
import kz.onggar.pattern.abstractfactory.uicomponent.mac.MacButton;
import kz.onggar.pattern.abstractfactory.uicomponent.mac.MacLabel;
import kz.onggar.pattern.abstractfactory.uicomponent.mac.MacScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.mac.MacWindow;

public class MacUserInterfaceFactory implements UserInterfaceAbstractFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Label createLabel() {
        return new MacLabel();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}