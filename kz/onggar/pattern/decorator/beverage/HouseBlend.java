package kz.onggar.pattern.decorator.beverage;

public class HouseBlend extends Beverage{

    @Override
    public String getDescription() {
        return "HouseBlend ";
    }

    @Override
    public int cost() {
        return 400;
    }
}
