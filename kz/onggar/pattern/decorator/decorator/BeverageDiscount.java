package kz.onggar.pattern.decorator.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;

public class BeverageDiscount extends Beverage {
    Beverage beverage;
    double discount;

    public BeverageDiscount(Beverage beverage, double discount) {
        this.beverage = beverage;
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with discount of " + (discount * 100) + "% ";
    }

    @Override
    public int cost() {
        return (int) Math.ceil(beverage.cost() * (1 - discount));
    }
}
