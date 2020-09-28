package be.kdg.prog1.m1;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int FinalNumber = 0;

        System.out.print("Enter a number: ");
        int FirstNumber = keyboard.nextInt();

        System.out.print("Enter another number: ");
        int SecondNumber = keyboard.nextInt();

        System.out.print("Choose an operation: ");
        String operation = keyboard.next();

        switch(operation) {
            case "add":
                System.out.println("Your choice: 1");
                FinalNumber = FirstNumber + SecondNumber;
                System.out.println(FirstNumber + " + " + SecondNumber + " = " + FinalNumber);
                break;
            case "substract":
                System.out.println("Your choice: 2");
                FinalNumber = FirstNumber - SecondNumber;
                System.out.println(FirstNumber + " - " + SecondNumber + " = " + FinalNumber);
                break;
            case "multiply":
                System.out.println("Your choice: 3");
                FinalNumber = FirstNumber * SecondNumber;
                System.out.println(FirstNumber + " * " + SecondNumber + " = " + FinalNumber);

                break;
            case "divide":
                System.out.println("Your choice: 4");
                FinalNumber = FirstNumber / SecondNumber;
                System.out.println(FirstNumber + " / " + SecondNumber + " = " + FinalNumber);
                break;
            case "expo":
                System.out.println("Your choice: 5");
                FinalNumber = 1;
                int SecondNumberBak = SecondNumber;

                while (SecondNumberBak > 0) {
                    FinalNumber *= FirstNumber;
                    SecondNumberBak--;
                }
                System.out.println(FirstNumber + "^" + SecondNumber + " = " + FinalNumber);
//            default:
//                System.out.println("Please enter a valid operation.");
//                System.exit(0);
//                break;
        }

    }
}
