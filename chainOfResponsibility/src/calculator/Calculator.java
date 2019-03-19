package calculator;

interface Calculator {
    abstract public void nextCalculator(Calculator nextCalculator);
    abstract public int calculate(int firstNum, int secondNum, String operation);
}
