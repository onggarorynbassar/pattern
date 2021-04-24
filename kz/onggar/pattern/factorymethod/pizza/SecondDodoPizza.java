package kz.onggar.pattern.factorymethod.pizza;

public class SecondDodoPizza extends Pizza {
    @Override
    public int getCost() {
        return 1750;
    }

    @Override
    public String getName() {
        return "Second";
    }

    @Override
    public int getRating() {
        return 4;
    }
}
