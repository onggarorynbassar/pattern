package kz.onggar.pattern.singleton;

public class MegaSingleton {
    private volatile static MegaSingleton instance;

    private String someProperty;
    private String anotherProperty;

    private MegaSingleton() {
    }

    public static MegaSingleton getInstance() {
        if (instance == null) {
            synchronized (MegaSingleton.class) {
                if (instance == null) {
                    instance = new MegaSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "MegaSingleton{" +
                "someProperty='" + someProperty + '\'' +
                ", anotherProperty='" + anotherProperty + '\'' +
                '}';
    }
}
