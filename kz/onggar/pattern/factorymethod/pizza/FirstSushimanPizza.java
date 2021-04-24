package kz.onggar.pattern.factorymethod.pizza;

public class FirstSushimanPizza extends Pizza {
    @Override
    public int getCost() {
        return 2500;
    }

    @Override
    public String getName() {
        return "First";
    }

    @Override
    public int getRating() {
        return 1;
    }
}
