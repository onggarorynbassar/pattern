package kz.onggar.pattern.abstractfactory.uicomponent.windows;

import kz.onggar.pattern.abstractfactory.uicomponent.ScrollBar;

public class WindowsScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Windows scroll bar scrolling");
    }
}
