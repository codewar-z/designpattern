package condinments;

import beverages.Beverage;

public class Coffee extends CondimentDecorator {
	Beverage beverage;

	public Coffee(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " Coffee";
	}

	public double cost() {
		return 1.99 + beverage.cost();
	}
}
