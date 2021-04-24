package kz.onggar.pattern.decorator.beverage;

public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "Espresso ";
    }

    @Override
    public int cost() {
        return 600;
    }
}
