package kz.onggar.pattern.abstractfactory.uicomponent.mac;

import kz.onggar.pattern.abstractfactory.uicomponent.Component;
import kz.onggar.pattern.abstractfactory.uicomponent.Window;

public class MacWindow implements Window {

    @Override
    public void draw(Component component) {
        System.out.println("Draw on Mac window");
    }
}
