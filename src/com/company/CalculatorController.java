package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        view.addListener(this);
        setView(this.view);
    }

    class NumListener implements ActionListener {
        private int num;

        NumListener(int num) {
            this.num = num;
        }

        public void actionPerformed(ActionEvent e) {
            model.setNum(num);
            view.updateDisplay(model.getResult());
        }
    }

    class ModeListener implements ActionListener {
        private String mode;

        ModeListener(String mode) {
            this.mode = mode;
        }

        public void actionPerformed(ActionEvent e) {
            model.setMode(mode);
        }
    }

    public void setView(CalculatorView view) {
        view.getNum0().addActionListener(new NumListener(0));
        view.getNum1().addActionListener(new NumListener(1));
        view.getNum2().addActionListener(new NumListener(2));
        view.getNum3().addActionListener(new NumListener(3));
        view.getNum4().addActionListener(new NumListener(4));
        view.getNum5().addActionListener(new NumListener(5));
        view.getNum6().addActionListener(new NumListener(6));
        view.getNum7().addActionListener(new NumListener(7));
        view.getNum8().addActionListener(new NumListener(8));
        view.getNum9().addActionListener(new NumListener(9));
        view.getAdd().addActionListener(new ModeListener("+"));
        view.getSubtract().addActionListener(new ModeListener("-"));
        view.getMultiply().addActionListener(new ModeListener("*"));
        view.getDivide().addActionListener(new ModeListener("/"));
    }
}
