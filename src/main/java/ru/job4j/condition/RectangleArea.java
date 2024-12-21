package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return height * length;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, actual s result = " + result1);
        double result2 = RectangleArea.square(5, 4);
        System.out.println(" p = 5, k = 4, s = 2, actual s result = " + result2);
        double result3 = RectangleArea.square(2, 2);
        System.out.println(" p = 2, k = 2, s = 2, actual s result = " + result3);
        double result4 = RectangleArea.square(4, 4);
        System.out.println(" p = 4, k = 4, s = 2, actual s result = " + result4);
    }
}
