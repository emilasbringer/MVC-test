import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField result;
    private JButton executeButton;
    private JPanel calculatorPanel;

    public JPanel getPanel() {
        return calculatorPanel;
    }

    public JButton getCalculateButton() {
        return executeButton;
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(double result) {
        this.result.setText("" + result);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
