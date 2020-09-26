package be.kdg.prog1.m1;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int number = 1;

        while(number != 0) {
            System.out.print("Enter a number (to stop enter 0): ");
            if(keyboard.hasNextInt()) {
                number = keyboard.nextInt();
                sum = sum + number;
            } else {
                System.out.println("Sir that's not a number.");
                System.exit(0);
            }
        }

        System.out.println("The sum of these numbers is: " + sum);
    }
}
