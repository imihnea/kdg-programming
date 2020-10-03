package be.kdg.prog1.m1;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers do you want to print? ");
        int times = keyboard.nextInt();

        System.out.print("What is the starting value? ");
        int start = keyboard.nextInt();

        System.out.print("What is the increment? ");
        int increment = keyboard.nextInt();

        for (int i = 1; i<= times; i++) {
            System.out.print(start + " ");
            start = start + increment;
        }
    }
}
