package week14_exceptions.bank;

public class CannotBeNegativeException extends Exception{
    public CannotBeNegativeException() {
        super("The input can't be negative");
    }
}
