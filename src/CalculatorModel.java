public class CalculatorModel {
    private  double result;

    public CalculatorModel() {

    }

    public void addNumbers(double firstNumber, double secondNumber) {
        result = firstNumber + secondNumber;
    }

    public double getResult() {
        return result;
    }

}
