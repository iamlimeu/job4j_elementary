package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 174;
        double man = manWeight(height);
        System.out.println("Man's height 174 cm is " + man + "kg");
        double woman = womanWeight(height);
        System.out.println("Woman's height 174 cm is " + woman + "kg");
    }
}
