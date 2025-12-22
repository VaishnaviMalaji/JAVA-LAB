import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionApp {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(350, 220);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel lblNum1 = new JLabel("Num1:");
        JLabel lblNum2 = new JLabel("Num2:");
        JLabel lblResult = new JLabel("Result:");

        JTextField txtNum1 = new JTextField();
        JTextField txtNum2 = new JTextField();
        JTextField txtResult = new JTextField();
        txtResult.setEditable(false);

        JButton btnDivide = new JButton("Divide");

        // Add components to frame
        frame.add(lblNum1);
        frame.add(txtNum1);
        frame.add(lblNum2);
        frame.add(txtNum2);
        frame.add(lblResult);
        frame.add(txtResult);
        frame.add(new JLabel());
        frame.add(btnDivide);

        // Button action
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());

                    int result = num1 / num2;
                    txtResult.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Please enter valid integers!",
                            "Number Format Exception",
                            JOptionPane.ERROR_MESSAGE
                    );
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Division by zero is not allowed!",
                            "Arithmetic Exception",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        frame.setVisible(true);
    }
}
