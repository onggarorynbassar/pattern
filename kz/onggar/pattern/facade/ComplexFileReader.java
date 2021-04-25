package kz.onggar.pattern.facade;

import java.util.Random;

public class ComplexFileReader implements HardToUseInterface {
    @Override
    public void openFile() {
        System.out.println("open file");
    }

    @Override
    public void closeFile() {
        System.out.println("close file");
    }

    @Override
    public byte readByte() {
        return (byte) new Random().nextInt();
    }

    @Override
    public boolean hasNext() {
        return new Random().nextInt(25) != 0;
    }
}
