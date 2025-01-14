package ru.job4j.condition;

public class AlertDivByZero {

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Could not divide by 0.");
        }
        if (number < 0) {
            System.out.println("This is a negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(7);
        AlertDivByZero.checkNumber(0);
        AlertDivByZero.checkNumber(-8);
    }
}
