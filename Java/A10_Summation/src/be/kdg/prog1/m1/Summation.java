package be.kdg.prog1.m1;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Boolean Decision = true;

        while(Decision) {
            int Sum = 0;
            int Number = 1;
            int TotalNumbers = 0;

            while (Number != 0) {
                System.out.print("Enter a number (to stop enter 0): ");
                if (Keyboard.hasNextInt()) {
                    Number = Keyboard.nextInt();
                    Sum = Sum + Number;
                    if (Number != 0) TotalNumbers++;
                } else {
                    System.out.println("Sir, that's not a number.");
                    System.exit(0);
                }
            }

            System.out.println("-----------------------------------");
            System.out.println("The sum of these numbers is: " + Sum);
            System.out.println("Total numbers entered: " + TotalNumbers);
            System.out.println("-----------------------------------");

            System.out.print("Would you like to calculate a new summation? ");
            String UserDecision = Keyboard.next();
            if(!UserDecision.equals("yes")) Decision = false;
        }

        System.out.println("Program terminated.");
        System.exit(0);
    }
}
