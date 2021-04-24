package kz.onggar.pattern.decorator.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;

public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with whip ";
    }

    @Override
    public int cost() {
        return beverage.cost() + 150;
    }
}
