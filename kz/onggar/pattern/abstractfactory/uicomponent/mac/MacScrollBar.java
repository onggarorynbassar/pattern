package kz.onggar.pattern.abstractfactory.uicomponent.mac;

import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;

public class MacScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Mac scroll bar scrolling");
    }
}
