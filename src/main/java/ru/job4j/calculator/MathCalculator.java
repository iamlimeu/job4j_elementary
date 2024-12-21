package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumAllFunctions(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы вычитания и деления равен: " + subtractionAndDivision(40, 20));
        System.out.println("Результат расчета суммы всех операций равен: " + sumAllFunctions(10, 5));
    }
}
