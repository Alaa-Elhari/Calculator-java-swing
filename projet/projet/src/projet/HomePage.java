package projet;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    private JButton simpleCalculatorButton, scientificCalculatorButton,DecbinCalculatorButton;

    public HomePage() {
        initComponents();
        setLocationRelativeTo(null); // Center window on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home Page");
    }

    private void initComponents() {
        // Initialize components
        simpleCalculatorButton = new JButton("Simple Calculator");
        scientificCalculatorButton = new JButton("Scientific Calculator");
        DecbinCalculatorButton = new JButton("Dec BIn  Calculator");

        // Add action listeners to buttons
        simpleCalculatorButton.addActionListener(e -> openSimpleCalculator());
        scientificCalculatorButton.addActionListener(e -> openScientificCalculator());
        DecbinCalculatorButton.addActionListener(e -> openDecbinCalculatorButton());
        // Create layout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.add(simpleCalculatorButton);
        panel.add(scientificCalculatorButton);
        panel.add(DecbinCalculatorButton);

        // Add components to frame
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.add(panel, BorderLayout.CENTER);

        // Set frame properties
        pack();
        setResizable(false);
    }

    private void openDecbinCalculatorButton() {
		// TODO Auto-generated method stub
    	DecBinCalculator DecBinCalculator = new DecBinCalculator();
        projet.DecBinCalculator.main(null);
	}

	private void openSimpleCalculator() {
        calculator calculator = new calculator();
        
         
            projet.calculator.main(null);
         
    }

    private void openScientificCalculator() {
        ScientificCalculator calculator = new ScientificCalculator();
        projet.ScientificCalculator.main(null);
    }
    

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }
}
