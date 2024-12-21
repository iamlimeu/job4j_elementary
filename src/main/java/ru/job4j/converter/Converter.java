package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rubleToEuroInput = 140F;
        float expectedEuro = 2F;
        float rubleToEuroOutput = Converter.rubleToEuro(rubleToEuroInput);
        boolean euroPassed = expectedEuro == rubleToEuroOutput;
        System.out.println("140 rubles are 2 euros. Test result : " + euroPassed);
        float rubbleToDollarInput = 360F;
        float expectedDollar = 6F;
        float rubleToDollarOutput = Converter.rubleToDollar(rubbleToDollarInput);
        boolean dollarPassed = expectedDollar == rubleToDollarOutput;
        System.out.println("360 rubles are 6 dollars. Test result: " + dollarPassed);
    }
}
