package kz.onggar.pattern.abstractfactory;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;
import kz.onggar.pattern.abstractfactory.uicomponent.Label;
import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;

public interface UserInterfaceAbstractFactory {
    Button createButton();
    Label createLabel();
    ScrollBar createScrollBar();
    Window createWindow();
}
