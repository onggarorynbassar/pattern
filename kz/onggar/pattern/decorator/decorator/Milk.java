package kz.onggar.pattern.decorator.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;

public class Milk extends Beverage {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with milk ";
    }

    @Override
    public int cost() {
        return beverage.cost() + 100;
    }
}
