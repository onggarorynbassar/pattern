package kz.onggar.pattern.decorator.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;

public class VAT extends Beverage {
    Beverage beverage;
    double tax;

    public VAT(Beverage beverage, double tax) {
        this.beverage = beverage;
        this.tax = tax;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with tax " + (tax * 100) + "% ";
    }

    @Override
    public int cost() {
        return (int) Math.ceil(beverage.cost() * (1 + tax));
    }
}
