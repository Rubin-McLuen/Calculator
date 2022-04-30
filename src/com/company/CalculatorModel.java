package com.company;

public class CalculatorModel {
    private float num;
    private String mode = "None";
    private float result;

    public CalculatorModel() {
    }

    public void calculate(float num2){
        result = 0;
        switch (mode){
            case "+":
                result = num + num2;
                break;

            case "-":
                result = num - num2;
                break;

            case "*":
                result = num * num2;
                break;

            case "/":
                result = num / num2;
                break;
        }
        mode = "None";
    }

    public void setNum(float num) {
        if (mode == "None") {
            this.num = num;
            this.result = num;
        }
        else{
            calculate(num);
        }
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public float getResult() {
        return result;
    }
}
