package org.example.calculatorLv2;

import java.util.LinkedList;

public class CalculatorLv2 {
    private LinkedList<Integer> history = new LinkedList<>();

    protected int calculator(String sign, int number1, int number2) {
        int calResult = 0;
        if (sign.equals("+")) {
            calResult = number1 + number2;
        } else if (sign.equals("-")) {
            calResult = number1 - number2;
        } else if (sign.equals("*")) {
            calResult = number1 * number2;
        } else if (sign.equals("/")) {
            if (number2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            calResult = number1 / number2;
        } else {
            System.out.println("잘못된 기호입니다.");
            return 0;
        }

        return calResult;
    }