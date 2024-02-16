package ru.gb.oop.dz_task_4;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private List<Number> array;

    public <T extends Number> Calculator(T... array) {
        this.array = Arrays.asList(array);
    }

    public double sum() {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double multiply() {
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль невозможно!");
            return Double.NaN;
        }
        return a / b;
    }

    public String conversionToBin(Integer number) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        while (number >= 1) {
            temp = number % 2;
            result.insert(0, temp);
            number /= 2;
        }
        return result.toString();
    }

    public int conversionToDecimal(String strNum) {
        int decimal = 0;
        int length = strNum.length();
        for (int i = 0; i < strNum.length(); i++) {
            char c = strNum.charAt(i);
            int bit = Character.getNumericValue(c);
            int exponent = length - 1 - i;
            decimal += bit * Math.pow(2, exponent);
        }
        return decimal;
    }


}
