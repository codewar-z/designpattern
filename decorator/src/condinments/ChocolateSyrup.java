package condinments;

import beverages.Beverage;

public class ChocolateSyrup extends CondimentDecorator {
	Beverage beverage;

	public ChocolateSyrup(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " ChocolateSyrup";
	}

	public double cost() {
		return 1.49 + beverage.cost();
	}
}
