package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        do {
            System.out.println("Enter password: ");
            password = sc.nextInt();
        } while (password != 555);
        System.out.println("Password successfully entered!");
    }
}
