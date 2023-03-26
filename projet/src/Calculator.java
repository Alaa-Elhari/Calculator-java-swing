import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    // Declare GUI components
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonClear, buttonEquals;

    // Declare variables
    private double firstNumber, secondNumber, result;
    private String operator;

    // Constructor
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create GUI components
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        button7 = new JButton("7");
        button7.addActionListener(this);
        buttonPanel.add(button7);

        button8 = new JButton("8");
        button8.addActionListener(this);
        buttonPanel.add(button8);

        button9 = new JButton("9");
        button9.addActionListener(this);
        buttonPanel.add(button9);

        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);
        buttonPanel.add(buttonDivide);

        button4 = new JButton("4");
        button4.addActionListener(this);
        buttonPanel.add(button4);

        button5 = new JButton("5");
        button5.addActionListener(this);
        buttonPanel.add(button5);

        button6 = new JButton("6");
        button6.addActionListener(this);
        buttonPanel.add(button6);

        buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(this);
        buttonPanel.add(buttonMultiply);

        button1 = new JButton("1");
        button1.addActionListener(this);
        buttonPanel.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        buttonPanel.add(button2);

        button3 = new JButton("3");
        button3.addActionListener(this);
        buttonPanel.add(button3);

        buttonSubtract = new JButton("-");
        buttonSubtract.addActionListener(this);
        buttonPanel.add(buttonSubtract);

        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        buttonPanel.add(buttonClear);

        button0 = new JButton("0");
        button0.addActionListener(this);
        buttonPanel.add(button0);

        buttonEquals = new JButton("=");
        buttonEquals.addActionListener(this);
        buttonPanel.add(buttonEquals);

        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        buttonPanel.add(buttonAdd);

        add(buttonPanel, BorderLayout.CENTER);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText()+"7");
} else if (e.getSource() == button8) {
textField.setText(textField.getText() + "8");
} else if (e.getSource() == button9) {
textField.setText(textField.getText() + "9");
} else if (e.getSource() == buttonAdd) {
operator = "+";
firstNumber = Double.parseDouble(textField.getText());
textField.setText("");
} else if (e.getSource() == buttonSubtract) {
operator = "-";
firstNumber = Double.parseDouble(textField.getText());
textField.setText("");
} else if (e.getSource() == buttonMultiply) {
operator = "";
firstNumber = Double.parseDouble(textField.getText());
textField.setText("");
} else if (e.getSource() == buttonDivide) {
operator = "/";
firstNumber = Double.parseDouble(textField.getText());
textField.setText("");
} else if (e.getSource() == buttonClear) {
textField.setText("");
} else if (e.getSource() == buttonEquals) {
secondNumber = Double.parseDouble(textField.getText());
if (operator.equals("+")) {
result = firstNumber + secondNumber;
} else if (operator.equals("-")) {
result = firstNumber - secondNumber;
} else if (operator.equals("")) {
result = firstNumber * secondNumber;
} else if (operator.equals("/")) {
result = firstNumber / secondNumber;
}
textField.setText(String.valueOf(result));
}
}
// Main method
public static void main(String[] args) {
Calculator calculator = new Calculator();
calculator.setVisible(true);
}
}