package kz.onggar.pattern.abstractfactory.uicomponent.linux;

import kz.onggar.pattern.abstractfactory.uicomponent.Label;

public class LinuxLabel implements Label {

    @Override
    public void setText(String newText) {
        System.out.println("Linux label text changed to :" + newText);
    }
}
