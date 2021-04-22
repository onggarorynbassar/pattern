package kz.onggar.pattern.abstractfactory;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;
import kz.onggar.pattern.abstractfactory.uicomponent.Label;
import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;
import kz.onggar.pattern.abstractfactory.uicomponent.windows.WindowsButton;
import kz.onggar.pattern.abstractfactory.uicomponent.windows.WindowsLabel;
import kz.onggar.pattern.abstractfactory.uicomponent.windows.WindowsScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.windows.WindowsWindow;

public class WindowsUserInterfaceFactory implements UserInterfaceAbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
