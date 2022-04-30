package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JPanel{
    private CalculatorController calculatorController;

    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton add;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton subtract;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton multiply;
    private JButton num0;
    private JButton divide;

    private JLabel display;
    public CalculatorView() {
        setLayout(new BorderLayout());
        display = new JLabel(Float.toString(0));
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));
        buttons.setBackground(Color.LIGHT_GRAY);
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.SOUTH);


        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        add = new JButton("+");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        subtract = new JButton("-");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        multiply = new JButton("*");
        num0 = new JButton("0");
        JSeparator sep1 = new JSeparator();
        divide = new JButton("/");
        JSeparator sep2 = new JSeparator();

        buttons.add(num1);
        buttons.add(num2);
        buttons.add(num3);
        buttons.add(add);
        buttons.add(num4);
        buttons.add(num5);
        buttons.add(num6);
        buttons.add(subtract);
        buttons.add(num7);
        buttons.add(num8);
        buttons.add(num9);
        buttons.add(multiply);
        buttons.add(sep1);
        buttons.add(num0);
        buttons.add(sep2);
        buttons.add(divide);

        num0.setText("0");
    }

    public void updateDisplay(float num){
        display.setText(String.valueOf(num));
    }

    public void addListener(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    public JButton getNum1() {
        return num1;
    }

    public JButton getNum2() {
        return num2;
    }

    public JButton getNum3() {
        return num3;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getNum4() {
        return num4;
    }

    public JButton getNum5() {
        return num5;
    }

    public JButton getNum6() {
        return num6;
    }

    public JButton getSubtract() {
        return subtract;
    }

    public JButton getNum7() {
        return num7;
    }

    public JButton getNum8() {
        return num8;
    }

    public JButton getNum9() {
        return num9;
    }

    public JButton getMultiply() {
        return multiply;
    }

    public JButton getNum0() {
        return num0;
    }

    public JButton getDivide() {
        return divide;
    }
}
