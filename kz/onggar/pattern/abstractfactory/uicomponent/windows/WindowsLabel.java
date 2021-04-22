package kz.onggar.pattern.abstractfactory.uicomponent.windows;

import kz.onggar.pattern.abstractfactory.uicomponent.Label;

public class WindowsLabel implements Label {

    @Override
    public void setText(String newText) {
        System.out.println("Windows label text changed to :" + newText);
    }
}
