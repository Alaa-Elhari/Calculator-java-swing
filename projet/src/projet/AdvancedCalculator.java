package projet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdvancedCalculator extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Window frame = null;
	private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonClear, buttonBackspace, buttonEquals, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private JButton buttonSquare, buttonCube, buttonSquareRoot, buttonFactorial, buttonInverse, buttonPi, buttonE;
    private JButton buttonSin, buttonCos, buttonTan, buttonLog, buttonLn, buttonPower;
    private double firstNumber, num2, result;
    private String operator;
	private Object buttonPercent;
    
    public AdvancedCalculator() {
        setTitle("Advanced Calculator");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        textField = new JTextField(20);
        textField.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        panel.add(textField, gbc);
        
        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(buttonClear, gbc);
        
        buttonBackspace = new JButton("<-");
        buttonBackspace.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(buttonBackspace, gbc);
        
        buttonPower = new JButton("^");
        buttonPower.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(buttonPower, gbc);
        
        buttonPi = new JButton("π");
        buttonPi.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(buttonPi, gbc);
        
        buttonE = new JButton("e");
        buttonE.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 1;
        panel.add(buttonE, gbc);
        
        buttonSquare = new JButton("x²");
        buttonSquare.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(buttonSquare, gbc);
        
        buttonCube = new JButton("x³");
        buttonCube.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(buttonCube, gbc);
        
        buttonSquareRoot = new JButton("√x");
        buttonSquareRoot.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(buttonSquareRoot, gbc);
        
        buttonFactorial = new JButton("x!");
        buttonFactorial.addActionListener(this);
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(buttonFactorial, gbc);
        
        buttonInverse = new JButton("1/x");
        buttonInverse.addActionListener(this);
        gbc.gridx = 4;
        gbc.gridy = 2;
        panel.add(buttonInverse, gbc);
        
        buttonSin = new JButton("sin");
        buttonSin.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(buttonSin, gbc);
        
        buttonCos = new JButton("cos");
        buttonCos.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 3;
    panel.add(buttonCos, gbc);
    
    buttonTan = new JButton("tan");
    buttonTan.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 3;
    panel.add(buttonTan, gbc);
    
    buttonLog = new JButton("log");
    buttonLog.addActionListener(this);
    gbc.gridx = 3;
    gbc.gridy = 3;
    panel.add(buttonLog, gbc);
    
    buttonLn = new JButton("ln");
    buttonLn.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 3;
    panel.add(buttonLn, gbc);
    
    button7 = new JButton("7");
    button7.addActionListener(this);
    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(button7, gbc);
    
    button8 = new JButton("8");
    button8.addActionListener(this);
    gbc.gridx = 1;
    gbc.gridy = 4;
    panel.add(button8, gbc);
    
    button9 = new JButton("9");
    button9.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 4;
    panel.add(button9, gbc);
    
    buttonDivide = new JButton("/");
    buttonDivide.addActionListener(this);
    gbc.gridx = 3;
    gbc.gridy = 4;
    panel.add(buttonDivide, gbc);
    
    buttonSin = new JButton("sin");
    buttonSin.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 4;
    panel.add(buttonSin, gbc);
    
    button4 = new JButton("4");
    button4.addActionListener(this);
    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(button4, gbc);
    
    button5 = new JButton("5");
    button5.addActionListener(this);
    gbc.gridx = 1;
    gbc.gridy = 5;
    panel.add(button5, gbc);
    
    button6 = new JButton("6");
    button6.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 5;
    panel.add(button6, gbc);
    
    buttonMultiply = new JButton("*");
    buttonMultiply.addActionListener(this);
    gbc.gridx = 3;
    gbc.gridy = 5;
    panel.add(buttonMultiply, gbc);
    
    buttonCos = new JButton("cos");
    buttonCos.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 5;
    panel.add(buttonCos, gbc);
    
    button1 = new JButton("1");
    button1.addActionListener(this);
    gbc.gridx = 0;
    gbc.gridy = 6;
    panel.add(button1, gbc);
    
    button2 = new JButton("2");
    button2.addActionListener(this);
    gbc.gridx = 1;
    gbc.gridy = 6;
    panel.add(button2, gbc);
    
    button3 = new JButton("3");
    button3.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 6;
    panel.add(button3, gbc);
    
    buttonSubtract = new JButton("-");
    buttonSubtract.addActionListener(this);
    gbc.gridx = 3;
    gbc.gridy = 6;
    panel.add(buttonSubtract, gbc);
    
    buttonTan = new JButton("tan");
    buttonTan.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 6;
    panel.add(buttonTan, gbc);
    
    button0 = new JButton("0");
    button0.addActionListener(this);
    gbc.gridx = 0;
    gbc.gridy = 7;
    panel.add(button0, gbc);
    
    buttonPi = new JButton("π");
    buttonPi.addActionListener(this);
    gbc.gridx = 1;
    gbc.gridy = 7;
    JButton buttonDot;
	panel.add(buttonPi,
    buttonDot = new JButton("."));
    buttonDot.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 7;
    panel.add(buttonDot, gbc);
    
    buttonAdd = new JButton("+");
    buttonAdd.addActionListener(this);
    gbc.gridx = 3;
    gbc.gridy = 7;
    panel.add(buttonAdd, gbc);
    
    buttonEquals = new JButton("=");
    buttonEquals.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 7;
    gbc.gridheight = 2;
    panel.add(buttonEquals, gbc);
    
    // Add panel to frame
    frame.add(panel);
    
    // Set frame properties
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public void actionPerformed(ActionEvent e, Object buttonDot) {
    // Handle button clicks
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
        textField.setText(textField.getText() + "7");
    } else if (e.getSource() == button8) {
    	textField.setText(textField.getText() + "8");
    } else if (e.getSource() == button9) {
        textField.setText(textField.getText() + "9");
    } else if (e.getSource() == buttonDot) {
        textField.setText(textField.getText() + ".");
    } else if (e.getSource() == buttonAdd) {
    	firstNumber = Double.parseDouble(textField.getText());
        operator = "+";
        textField.setText("");
    } else if (e.getSource() == buttonSubtract) {
    	firstNumber = Double.parseDouble(textField.getText());
        operator = "-";
        textField.setText("");
    } else if (e.getSource() == buttonMultiply) {
    	firstNumber = Double.parseDouble(textField.getText());
        operator = "*";
        textField.setText("");
    } else if (e.getSource() == buttonDivide) {
    	firstNumber = Double.parseDouble(textField.getText());
        operator = "/";
        textField.setText("");
    } else if (e.getSource() == buttonEquals) {
    	firstNumber = Double.parseDouble(textField.getText());
        if (operator.equals("+")) {
            result = firstNumber + num2;
        } else if (operator.equals("-")) {
            result = firstNumber - num2;
        } else if (operator.equals("*")) {
            result = firstNumber * num2;
        } else if (operator.equals("/")) {
            result = firstNumber / num2;
        }
        textField.setText(Double.toString(result));
    } else if (e.getSource() == buttonClear) {
        textField.setText("");
    } else if (e.getSource() == buttonSin) {
    	firstNumber = Double.parseDouble(textField.getText());
        result = Math.sin(firstNumber);
        textField.setText(Double.toString(result));
    } else if (e.getSource() == buttonCos) {
    	firstNumber = Double.parseDouble(textField.getText());
        result = Math.cos(firstNumber);
        textField.setText(Double .toString(result));
} else if (e.getSource() == buttonTan) {
	firstNumber = Double.parseDouble(textField.getText());
result = Math.tan(firstNumber);
textField.setText(Double.toString(result));
} else if (e.getSource() == buttonLog) {
	firstNumber = Double.parseDouble(textField.getText());
result = Math.log10(firstNumber);
textField.setText(Double.toString(result));
} else if (e.getSource() == buttonSquare) {
	firstNumber = Double.parseDouble(textField.getText());
result = Math.sqrt(firstNumber);
textField.setText(Double.toString(result));
} else if (e.getSource() == buttonPower) {
	firstNumber = Double.parseDouble(textField.getText());
operator = "^";
textField.setText("");
} else if (e.getSource() == buttonPi) {
	firstNumber = Double.parseDouble(textField.getText());
result = Math.exp(firstNumber);
textField.setText(Double.toString(result));
} else if (e.getSource() == buttonInverse) {
	firstNumber = Double.parseDouble(textField.getText());
result = 1 / firstNumber;
textField.setText(Double.toString(result));
} else if (e.getSource() == buttonPercent) {
	firstNumber = Double.parseDouble(textField.getText());
result = firstNumber / 100;
textField.setText(Double.toString(result));
}
}

public static void main(String[] args) {
    new AdvancedCalculator();
}}