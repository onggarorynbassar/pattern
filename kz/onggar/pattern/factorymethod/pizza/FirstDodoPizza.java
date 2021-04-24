package kz.onggar.pattern.factorymethod.pizza;

public class FirstDodoPizza extends Pizza {
    @Override
    public int getCost() {
        return 2000;
    }

    @Override
    public String getName() {
        return "First";
    }

    @Override
    public int getRating() {
        return 5;
    }
}
