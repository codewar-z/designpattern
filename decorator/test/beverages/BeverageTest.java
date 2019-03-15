package beverages;

import condinments.ChocolateSyrup;
import condinments.MilkFoam;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeverageTest {
    @Test
    public void shouldGiveCostOfBeverage() {
        Beverage beverage = new Cappuccino();
        assertEquals("Cappuccino -> ", beverage.getDescription());
        assertEquals(5.08, beverage.cost(), 0);
    }

    @Test
    public void shouldGiveCostOfBeverageWithDecorator() {
        Beverage beverage = new Cappuccino();
        beverage = new MilkFoam(beverage);
        beverage = new ChocolateSyrup(beverage);

        assertEquals("Cappuccino ->  MilkFoam ChocolateSyrup", beverage.getDescription());
        assertEquals(6.67, beverage.cost(), 0);
    }
}
