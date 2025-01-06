package org.example.calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" 첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print(" 두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            if (num1 < 0 || num2 < 0 ) {
                System.out.println(" 음수는 입력할 수 없습니다. ");
                break;
                }

            System.out.print(" 사칙연산 기호를 입력하세요: ");
            char op = scanner.next().charAt(0);

            int result = 0;


            if (op == '/' && num2 == 0) {
                System.out.println(" 0으로 나눌 수 없습니다. ");
            } else if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                result = num1 - num2;
            } else System.out.println(" 잘못 입력하였습니다. ");
            System.out.println(" 계산 결과 " + result);
            System.out.println(" 계속 하시겠습니까? (exit 입력시 종료) ");
            scanner.nextLine();
            String string = scanner.nextLine();
            if (string.equals("exit")) {
                break;
            }
        }
            System.out.println( " 종료되었습니다." );
        }
    }
