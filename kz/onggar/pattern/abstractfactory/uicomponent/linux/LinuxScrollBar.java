package kz.onggar.pattern.abstractfactory.uicomponent.linux;

import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;

public class LinuxScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Linux scroll bar scrolling");
    }
}
