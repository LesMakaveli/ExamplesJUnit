public class Calculator
{
    private double firstNumber;
    private double secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}
