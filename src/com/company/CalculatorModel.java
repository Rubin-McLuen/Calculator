package com.company;

public class CalculatorModel {
    int num;
    String mode = "None";

    public CalculatorModel() {
    }

    public float calculate(int num2){
        float result = 0;

        switch (mode){
            case "add":
                result = num + num2;
                break;

            case "subtract":
                result = num - num2;
                break;

            case "multiply":
                result = num * num2;
                break;

            case "divide":
                result = num / num2;
                break;
        }
        return result;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
