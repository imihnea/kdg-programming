package be.kdg.prog.m2;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter the VAT percentage: ");
        float VAT = Keyboard.nextInt();

        System.out.print("Enter an amount in $: ");
        float Amount = Keyboard.nextInt();

        System.out.print("Make a choice (1 = inclusive, 2 = exclusive): ");
        int Choice = Keyboard.nextInt();

        if(Choice == 1) {
            // math is hard
            System.out.println("$" + (Amount * ((VAT / 100) + 1)) + " + " + VAT + "% VAT = $" + Amount );
        } else if (Choice == 2) {
            System.out.println("$" + Amount + " + " + VAT + "% VAT = $" + Amount + VAT);
        } else {
            System.err.println("Invalid choice!");
            System.exit(0);
        }
    }
}
