package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JPanel{
    float display_num = 0;
    CalculatorController calculatorController;

    JButton num1;
    JButton num2;
    JButton num3;
    JButton add;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton subtract;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton multiply;
    JButton num0;
    JSeparator sep1;
    JButton divide;
    JSeparator sep2;

    public CalculatorView() {
        setLayout(new BorderLayout());
        JLabel display = new JLabel(Float.toString(display_num));
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));
        buttons.setBackground(Color.LIGHT_GRAY);
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.SOUTH);


        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton add = new JButton("+");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton subtract = new JButton("-");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton multiply = new JButton("*");
        JButton num0 = new JButton("0");
        JSeparator sep1 = new JSeparator();
        JButton divide = new JButton("/");
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


    }

    public void setDisplay_num(float num){
        display_num = num;
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

    public JSeparator getSep1() {
        return sep1;
    }

    public JButton getDivide() {
        return divide;
    }

    public JSeparator getSep2() {
        return sep2;
    }
}
