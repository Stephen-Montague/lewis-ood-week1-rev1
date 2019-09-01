package edu.lewis.ood.week1.baking;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 1 - Baking Decorator
 *
 * Summary:
 *     Demonstrates a Decorator Pattern using a baking theme.
 *     Slightly mods Coffee & Pizza-themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 *
 * Program Notes:
 *     Prints a description of Cake objects, as decorated.
 *     Current output:
 *         Angel Food Cake, White Frosting, Candles $8.50
 *         Devil's Food Cake, Chocolate Frosting, Mixed Berries $10.00
 */

public class Bakery {
    // Driver class to create, decorate, and print cakes at runtime.

    public static void main(String args[]) {
        Cake cake1 = new FlavorAngelFood();
        cake1 = new TopFrostedWhite(cake1);
        cake1 = new TopCandles(cake1);
        System.out.println(cake1.getDescription()
                + " $" + String.format("%.2f", (double)cake1.cost()));

        Cake cake2 = new FlavorDevilsFood();
        cake2 = new TopFrostedChoco(cake2);
        cake2 = new TopMixedBerry(cake2);
        System.out.println(cake2.getDescription()
                + " $" + String.format("%.2f", (double)cake2.cost()));
    }
}

