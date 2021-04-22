package kz.onggar.pattern.abstractfactory.uicomponent.linux;

import kz.onggar.pattern.abstractfactory.uicomponent.Component;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;

public class LinuxWindow implements Window {

    @Override
    public void draw(Component component) {
        System.out.println("Draw on Linux window");
    }
}
