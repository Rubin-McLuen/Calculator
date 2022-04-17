package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorButtons extends JPanel{
    public CalculatorButtons() {
        setLayout(new GridLayout(4, 4));
        setBackground(Color.LIGHT_GRAY);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");
        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("*");
        JButton b13 = new JButton("0");
        JButton b14 = new JButton("=");
        JButton b15 = new JButton("/");
        JSeparator b16 = new JSeparator();



        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b16);
        add(b13);
        add(b14);
        add(b15);
    }
}
