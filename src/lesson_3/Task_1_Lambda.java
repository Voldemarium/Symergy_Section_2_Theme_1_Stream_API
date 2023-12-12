package lesson_3;

import task_1.Operation;

import java.util.Scanner;

public class Task_1_Lambda {
    static char op;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number, space,  operation, space, second number: ");
        final String expression = in.nextLine();
        String[] arrayStr = expression.split("[+-/*]");
        int a = 0, b = 0;
        if (arrayStr.length == 3) {
            a = Integer.parseInt(arrayStr[0]);
            op = arrayStr[1].charAt(0);
            b = Integer.parseInt(arrayStr[2]);
        } else {
            System.out.println("expression have not 3 sign");
        }

        Operation sum = (a1, b1) -> a1 + b1;
        Operation subtract = (a12, b12) -> a12 - b12;
        Operation multiple = (a13, b13) -> a13 * b13;
        Operation divide = (a14, b14) -> (double) a14 / b14;

        double result = 0;
        switch (op) {
            case '+':
                result = sum.calculate(a, b);
                break;
            case '-':
                result = subtract.calculate(a, b);
                break;
            case '*':
                result = multiple.calculate(a, b);
                break;
            case '/':
                result = divide.calculate(a, b);
                break;
            default:
                System.out.println("Unknown operator");
        }
        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}
