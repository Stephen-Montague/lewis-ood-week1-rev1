package edu.lewis.ood.week1.baking;

public class TopFrostedWhite extends CakeDecorator {
	
 
	public TopFrostedWhite(Cake cake) {
		this.cake = cake;
	}
 
	public String getDescription() {
		return cake.getDescription() + ", White Frosting";
	}
 
	public double cost() {
		return cake.cost(); // Frosting is free.
	}
}
