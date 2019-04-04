package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void explorerTest() {
        Calculator calculator = new AddCalculator();
        Calculator subtract = new SubsCalculator();
        Calculator multiply = new MultiplyCalculator();
        Calculator divide = new DivisionCalculator();

        calculator.nextCalculator(subtract);
        subtract.nextCalculator(multiply);
        multiply.nextCalculator(divide);

        assertEquals(30, calculator.calculate(20, 10, "+"));
        assertEquals(10, calculator.calculate(20, 10, "-"));
        assertEquals(200, calculator.calculate(20, 10, "*"));
        assertEquals(2, calculator.calculate(20, 10, "/"));

    }
}
