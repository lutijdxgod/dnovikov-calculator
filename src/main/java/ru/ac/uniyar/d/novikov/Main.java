package ru.ac.uniyar.d.novikov;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println("Формат ввода: операнд1 оператор операнд2.");

        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            String expression = sc.nextLine();
            if (expression.equals("exit")) isRunning = false;
            if (!isRunning) break;
            String firstOperandRaw, secondOperandRaw, operator;
            try {
                String[] splitExpression = expression.split(" ");
                firstOperandRaw = splitExpression[0];
                secondOperandRaw = splitExpression[2];
                operator = splitExpression[1];
            } catch (Exception e) {
                System.out.println("Неверный формат ввода. Формат должен быть следующим: операнд1 оператор операнд2.");
                continue;
            }
            float firstOperand = Integer.parseInt(firstOperandRaw);
            float secondOperand = Integer.parseInt(secondOperandRaw);

            switch (operator) {
                case "+" -> {
                    float sumResult = firstOperand + secondOperand;
                    System.out.println(sumResult);
                }
                case "-" -> {
                    float subtractionResult = firstOperand - secondOperand;
                    System.out.println(subtractionResult);
                }
                case "*" -> {
                    float multiplicationResult = firstOperand * secondOperand;
                    System.out.println(multiplicationResult);
                }
                case "/" -> {
                    if (secondOperand == 0f){
                        System.out.println("Деление на ноль невозможно.");
                        continue;
                    }
                    float divisionResult = firstOperand / secondOperand;
                    System.out.println(divisionResult);



                }
            }


        }
    }
}