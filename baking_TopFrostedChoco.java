package edu.lewis.ood.week1.baking;

public class TopFrostedChoco extends CakeDecorator {

    public TopFrostedChoco(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Chocolate Frosting";
    }

    public double cost() {
        return cake.cost(); // Frosting is free.
    }
}
