import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController() {
        view = new CalculatorView();
        model = new CalculatorModel();

        JFrame frame = new JFrame("CalculatorView");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        view.getCalculateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addNumbers(view.getFirstNumber(), view.getSecondNumber());
                view.setResult((model.getResult()));
            }
        });
    }

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
    }
}
