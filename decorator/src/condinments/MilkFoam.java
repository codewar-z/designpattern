package condinments;

import beverages.Beverage;

public class MilkFoam extends CondimentDecorator {
	Beverage beverage;

	public MilkFoam(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " MilkFoam";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
