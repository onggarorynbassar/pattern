package kz.onggar.pattern.builder;

public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex.Builder("Onggar", "Orynbassar", "Ayapbergenovich").setF4("ffff").setF5("fffff").setF6("ffffff").build();
        System.out.println(complex);
    }
}
