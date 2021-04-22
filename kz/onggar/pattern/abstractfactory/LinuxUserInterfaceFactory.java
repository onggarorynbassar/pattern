package kz.onggar.pattern.abstractfactory;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;
import kz.onggar.pattern.abstractfactory.uicomponent.Label;
import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;
import kz.onggar.pattern.abstractfactory.uicomponent.linux.LinuxButton;
import kz.onggar.pattern.abstractfactory.uicomponent.linux.LinuxLabel;
import kz.onggar.pattern.abstractfactory.uicomponent.linux.LinuxScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.linux.LinuxWindow;

public class LinuxUserInterfaceFactory implements UserInterfaceAbstractFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}