package calculator2;

/**
 * simple.Memento Interface to simple.Originator
 *
 * This interface allows the originator to restore its state
 */
public interface PreviousCalculationToOriginator {

    public int getFirstNumber();
    public int getSecondNumber();
}