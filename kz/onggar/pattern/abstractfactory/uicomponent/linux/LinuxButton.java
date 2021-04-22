package kz.onggar.pattern.abstractfactory.uicomponent.linux;

import kz.onggar.pattern.abstractfactory.uicomponent.Button;

public class LinuxButton implements Button {

    @Override
    public void handleLeftClick() {
        System.out.println("Linux button left click");
    }

    @Override
    public void handleRightClick() {
        System.out.println("Linux button right click");
    }
}
