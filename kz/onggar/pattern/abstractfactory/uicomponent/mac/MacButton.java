package kz.onggar.pattern.abstractfactory.uicomponent.mac;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;

public class MacButton implements Button {

    @Override
    public void handleLeftClick() {
        System.out.println("Mac button left click");
    }

    @Override
    public void handleRightClick() {
        System.out.println("Mac button right click");
    }
}
