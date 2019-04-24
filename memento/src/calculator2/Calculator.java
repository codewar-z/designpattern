package calculator2;

/**
 * simple.Originator Interface
 */
public interface Calculator {

    // Create simple.Memento
    public PreviousCalculationToCareTaker backupLastCalculation();

    // setMemento
    public void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    // Actual Services Provided by the originator
    public int getCalculationResult();
    public void setFirstNumber(int firstNumber);
    public void setSecondNumber(int secondNumber);
}