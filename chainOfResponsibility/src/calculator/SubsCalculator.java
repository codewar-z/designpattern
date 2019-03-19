package calculator;

public class SubsCalculator implements Calculator {
    Calculator nextCalculator;

    @Override
    public void nextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    @Override
    public int calculate(int firstNum, int secondNum, String operation) {
        if(operation == "-") {
            int value = (firstNum - secondNum);
            System.out.println("result of " + firstNum + " - " + secondNum + " = " + value);
            return value;

        }
        return  nextCalculator.calculate(firstNum, secondNum, operation);
    }
}
