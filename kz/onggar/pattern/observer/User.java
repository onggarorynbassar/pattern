package kz.onggar.pattern.observer;

public class User implements Observer {

    @Override
    public void update(DataChunk dataChunk) {
        System.out.println("I received data chunk: " + dataChunk);
    }
}
