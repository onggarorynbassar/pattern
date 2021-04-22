package kz.onggar.pattern.abstractfactory.uicomponent.windows;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;

public class WindowsButton implements Button {

    @Override
    public void handleLeftClick() {
        System.out.println("Window button left click");
    }

    @Override
    public void handleRightClick() {
        System.out.println("Window button right click");
    }
}
