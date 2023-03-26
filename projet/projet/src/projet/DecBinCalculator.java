package projet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DecBinCalculator implements ActionListener {
  JFrame frame;
  JLabel label;
  JTextField textField;
  JTextField textResult;
  Font myFont13 = new Font("Dialog", 1, 13);
  Font myFont16 = new Font("Dialog", 1, 16);
  Font myFont24 = new Font("Dialog", 1, 24);
  JButton dotButton, clsButton, delButton, equButton, addButton, subButton, mulButton, divButton;
  JButton binDecButton, decBinButton, binButton, decButton, extButton;
  JButton[] functionButtons = new JButton[8];
  JButton[] numberButtons = new JButton[10];
  JButton[] extraButtons = new JButton[5];
  double decNum1, decNum2, decResult;
  String result = "", option = "";
  int binNum1, binNum2, binResult;
  char operator;

  public DecBinCalculator() {
    frame = new JFrame("Esparev's Calculator");

    dotButton = new JButton(".");
    clsButton = new JButton("Clear");
    delButton = new JButton("Delete");
    equButton = new JButton("=");
    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");

    binDecButton = new JButton("Binary to Decimal");
    decBinButton = new JButton("Decimal to Binary");
    binButton = new JButton("Binary");
    decButton = new JButton("Decimal");
    extButton = new JButton("Exit");

    label = new JLabel("Choose an operation");
    textField = new JTextField();
    textResult = new JTextField();

    functionButtons[0] = dotButton;
    functionButtons[1] = clsButton;
    functionButtons[2] = delButton;
    functionButtons[3] = equButton;
    functionButtons[4] = addButton;
    functionButtons[5] = subButton;
    functionButtons[6] = mulButton;
    functionButtons[7] = divButton;

    extraButtons[0] = binDecButton;
    extraButtons[1] = decBinButton;
    extraButtons[2] = binButton;
    extraButtons[3] = decButton;
    extraButtons[4] = extButton;

    frame.setSize(400, 430);

    label.setBounds(10, 10, 400, 20);
    label.setFont(myFont16);

    textResult.setBounds(10, 40, 370, 20);
    textResult.setHorizontalAlignment(textField.RIGHT);
    textResult.setBorder(null);
    textResult.setEditable(false);

    textField.setBounds(10, 60, 370, 30);
    textField.setHorizontalAlignment(textField.RIGHT);
    textField.setFont(myFont24);
    textField.setBorder(null);

    clsButton.setBounds(160, 115, 105, 50);
    delButton.setBounds(270, 115, 105, 50);
    divButton.setBounds(325, 170, 50, 50);
    mulButton.setBounds(325, 225, 50, 50);
    subButton.setBounds(325, 280, 50, 50);
    addButton.setBounds(325, 335, 50, 50);
    equButton.setBounds(270, 335, 50, 50);
    dotButton.setBounds(215, 335, 50, 50);

    binDecButton.setBounds(10, 115, 145, 50);
    decBinButton.setBounds(10, 170, 145, 50);
    binButton.setBounds(10, 225, 145, 50);
    decButton.setBounds(10, 280, 145, 50);
    extButton.setBounds(10, 335, 145, 50);

    for (int i = 0; i < 10; i++) {
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].setFont(myFont16);
      numberButtons[i].addActionListener(this);
    }

    numberButtons[0].setBounds(160, 335, 50, 50);
    numberButtons[1].setBounds(160, 280, 50, 50);
    numberButtons[2].setBounds(215, 280, 50, 50);
    numberButtons[3].setBounds(270, 280, 50, 50);
    numberButtons[4].setBounds(160, 225, 50, 50);
    numberButtons[5].setBounds(215, 225, 50, 50);
    numberButtons[6].setBounds(270, 225, 50, 50);
    numberButtons[7].setBounds(160, 170, 50, 50);
    numberButtons[8].setBounds(215, 170, 50, 50);
    numberButtons[9].setBounds(270, 170, 50, 50);

    for (int i = 0; i < extraButtons.length; i++) {
      extraButtons[i].setFont(myFont13);
      extraButtons[i].addActionListener(this);
      frame.add(extraButtons[i]);
    }

    for (int i = 0; i < functionButtons.length; i++) {
      functionButtons[i].setFont(myFont16);
      functionButtons[i].addActionListener(this);
      frame.add(functionButtons[i]);
    }

    for (int i = 0; i < numberButtons.length; i++) {
      frame.add(numberButtons[i]);
    }

    frame.add(label);
    frame.add(textField);
    frame.add(textResult);

    // Disable all numbers and all function numbers
    for (int i = 0; i < numberButtons.length; i++) {
      numberButtons[i].setEnabled(false);
    }
    for (int i = 0; i < functionButtons.length; i++) {
      functionButtons[i].setEnabled(false);
    }

    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new DecBinCalculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == binDecButton) { // when binary to decimal button is pressed
      label.setText("Binary to Decimal Conversion");
      textField.setText("");
      for (int i = 0; i < 2; i++) {
        numberButtons[i].setEnabled(true);
      }
      for (int i = 2; i < numberButtons.length; i++) {
        numberButtons[i].setEnabled(false);
      }
      for (int i = 0; i < functionButtons.length; i++) {
        functionButtons[i].setEnabled(false);
      }
      equButton.setEnabled(true);
      clsButton.setEnabled(true);
      delButton.setEnabled(true);
      option = "BinDec";
    }

    if (e.getSource() == decBinButton) { // when decimal to binary button is pressed
      label.setText("Decimal to Binary Conversion");
      textField.setText("");

      for (int i = 0; i < numberButtons.length; i++) {
        numberButtons[i].setEnabled(true);
      }

      for (int i = 0; i < functionButtons.length; i++) {
        functionButtons[i].setEnabled(false);
      }
      equButton.setEnabled(true);
      clsButton.setEnabled(true);
      delButton.setEnabled(true);
      option = "DecBin";
    }

    if (e.getSource() == binButton) { // when binary button is pressed
      label.setText("Operations with Binaries");
      textField.setText("");
      for (int i = 0; i < 2; i++) {
        numberButtons[i].setEnabled(true);
      }
      for (int i = 2; i < numberButtons.length; i++) {
        numberButtons[i].setEnabled(false);
      }
      for (int i = 0; i < functionButtons.length; i++) {
        functionButtons[i].setEnabled(true);
      }
      dotButton.setEnabled(false);
      option = "Bin";
    }

    if (e.getSource() == decButton) { // when decimal button is pressed
      label.setText("Operations with Decimals");
      textField.setText("");

      for (int i = 0; i < functionButtons.length; i++) {
        functionButtons[i].setEnabled(true);
      }
      for (int i = 0; i < numberButtons.length; i++) {
        numberButtons[i].setEnabled(true);
      }
      option = "Dec";
    }

    for (int i = 0; i < 10; i++) {
      if (e.getSource() == numberButtons[i]) {
        textField.setText(textField.getText().concat(String.valueOf(i)));
      }
    }

    if (e.getSource() == equButton) { // when equals button is pressed
      binNum2 = Integer.parseInt(textField.getText());
      decNum2 = Double.parseDouble(textField.getText());
      switch (option) {
      case "BinDec":
        textResult.setText(textField.getText());
        result = toDecimal(binNum2);
        break;
      case "DecBin":
        textResult.setText(textField.getText());
        result = toBinary(binNum2);
        break;
      case "Bin":
        result = binary();
        break;
      case "Dec":
        result = decimal();
        break;
      }
      textField.setText(result);
    }

    if (e.getSource() == dotButton) { // when decimal point button is pressed
      textField.setText(textField.getText().concat("."));
    }
    if (e.getSource() == addButton) { // when addition button is pressed
      decNum1 = Double.parseDouble(textField.getText());
      binNum1 = Integer.parseInt(textField.getText());
      operator = '+';
      textResult.setText(textField.getText().concat("+"));
      textField.setText("");
    }
    if (e.getSource() == subButton) { // when minus button is pressed
      decNum1 = Double.parseDouble(textField.getText());
      binNum1 = Integer.parseInt(textField.getText());
      operator = '-';
      textResult.setText(textField.getText().concat("-"));
      textField.setText("");
    }
    if (e.getSource() == mulButton) { // when multiplication button is pressed
      decNum1 = Double.parseDouble(textField.getText());
      binNum1 = Integer.parseInt(textField.getText());
      operator = '*';
      textResult.setText(textField.getText().concat("*"));
      textField.setText("");
    }
    if (e.getSource() == divButton) { // when division button is pressed
      decNum1 = Double.parseDouble(textField.getText());
      binNum1 = Integer.parseInt(textField.getText());
      operator = '/';
      textResult.setText(textField.getText().concat("/"));
      textField.setText("");
    }
    if (e.getSource() == clsButton) { // when clean button is pressed
      textField.setText("");
      textResult.setText("");
    }
    if (e.getSource() == delButton) { // when delete button is pressed
      String string = textField.getText();
      textField.setText("");

      for (int i = 0; i < string.length() - 1; i++) {
        textField.setText(textField.getText() + string.charAt(i));
      }
    }
    if (e.getSource() == extButton) { // when exit button is pressed
      System.exit(0);
    }
  }

  /**
   * Converts a number from the binary system to the decimal system
   * 
   * @param decNumber the number to convert
   * @return the number converted to String format
   */
  public String toDecimal(int decNumber) {
    int binaryAux, decimal = 0, i = 0;
    String toDecimalStr = "";

    while (decNumber != 0) {
      binaryAux = decNumber % 10;
      decimal += binaryAux * (int) Math.pow(2, i);
      decNumber /= 10;
      i++;
    }
    toDecimalStr = String.valueOf(decimal);
    return toDecimalStr;
  }

  /**
   * Converts a number from the decimal system to the binary system
   * 
   * @param binNumber the number to convert
   * @return the number converted to String format
   */
  public String toBinary(int binNumber) {
    int decimalAux;
    String toBinaryStr = "";
    ArrayList<String> binary = new ArrayList<String>();

    do {
      decimalAux = binNumber % 2;
      binNumber = binNumber / 2;
      binary.add(0, Integer.toString(decimalAux));
    } while (binNumber != 0);

    for (int i = 0; i < binary.size(); i++) {
      toBinaryStr += binary.get(i);
    }
    return toBinaryStr;
  }

  /**
   * Perform addition, subtraction, multiplication and division operations 
   * between two numbers in the binary system
   * 
   * @return the result in String format
   */
  public String binary() {
    String toBinaryStr = "";
    int decimal = 0;

    switch (operator) {
    case '+':
      decimal = Integer.parseInt(toDecimal(binNum1)) + Integer.parseInt(toDecimal(binNum2));
      binResult = Integer.parseInt(toBinary(decimal));
      break;
    case '-':
      decimal = Integer.parseInt(toDecimal(binNum1)) - Integer.parseInt(toDecimal(binNum2));
      binResult = Integer.parseInt(toBinary(decimal));
      break;
    case '*':
      decimal = Integer.parseInt(toDecimal(binNum1)) * Integer.parseInt(toDecimal(binNum2));
      binResult = Integer.parseInt(toBinary(decimal));
      break;
    case '/':
      decimal = Integer.parseInt(toDecimal(binNum1)) / Integer.parseInt(toDecimal(binNum2));
      binResult = Integer.parseInt(toBinary(decimal));
      break;
    }
    toBinaryStr = String.valueOf(binResult);
    binNum1 = binResult;
    return toBinaryStr;
  }

  /**
   * Perform operations of addition, subtraction, multiplication and division 
   * between two numbers of the decimal system
   * 
   * @return the result in String format
   */
  public String decimal() {
    String toDecimalStr = "";
    switch (operator) {
    case '+':
      decResult = decNum1 + decNum2;
      break;
    case '-':
      decResult = decNum1 - decNum2;
      break;
    case '*':
      decResult = decNum1 * decNum2;
      break;
    case '/':
      decResult = decNum1 / decNum2;
      break;
    }
    toDecimalStr = String.valueOf(decResult);
    decNum1 = decResult;
    return toDecimalStr;
  }
}