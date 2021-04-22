package kz.onggar.pattern.abstractfactory.uicomponent.windows;

import kz.onggar.pattern.abstractfactory.uicomponent.Component;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;

public class WindowsWindow implements Window {

    @Override
    public void draw(Component component) {
        System.out.println("Draw on Windows window");
    }
}
