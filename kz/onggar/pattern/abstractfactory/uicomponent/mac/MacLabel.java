package kz.onggar.pattern.abstractfactory.uicomponent.mac;

import kz.onggar.pattern.abstractfactory.uicomponent.Label;

public class MacLabel implements Label {

    @Override
    public void setText(String newText) {
        System.out.println("Mac label text changed to :" + newText);
    }
}
