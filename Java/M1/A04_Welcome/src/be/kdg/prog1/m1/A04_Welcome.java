package be.kdg.prog1.m1;

import java.util.Scanner;

public class A04_Welcome {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + "!");
    }
}
