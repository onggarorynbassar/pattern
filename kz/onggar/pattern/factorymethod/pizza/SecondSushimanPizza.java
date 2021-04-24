package kz.onggar.pattern.factorymethod.pizza;

public class SecondSushimanPizza extends Pizza {
    @Override
    public int getCost() {
        return 2700;
    }

    @Override
    public String getName() {
        return "Second";
    }

    @Override
    public int getRating() {
        return 2;
    }
}
