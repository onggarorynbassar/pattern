package kz.onggar.pattern.decorator.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;

public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with soy ";
    }

    @Override
    public int cost() {
        return beverage.cost() + 200;
    }
}
