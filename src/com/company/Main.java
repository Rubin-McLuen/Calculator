// THIS IS SHARED ON GITHUB TOO @ https://github.com/Rubin-McLuen/Calculator.git

package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(model, calculatorView);

        frame.add(calculatorView);
        frame.pack();
        frame.setVisible(true);
    }
}