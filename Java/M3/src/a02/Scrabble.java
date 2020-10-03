package a02;

import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please input a letter ");
        char UserInput = keyboard.next().charAt(0);
        char Letter = Character.toUpperCase(UserInput);

        System.out.print("Your letter is worth ");

        switch(Letter) {
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'S': case 'T': case 'R':
                System.out.print("1 point");
                break;
            case 'D': case 'G':
                System.out.print("2 points");
                break;
            case 'B': case 'C': case 'M': case 'P':
                System.out.print("3 points");
                break;
            case 'F': case 'H': case 'V': case 'W': case 'Y':
                System.out.print("4 points");
                break;
            case 'K':
                System.out.print("5 points");
                break;
            case 'J': case 'X':
                System.out.print("8 points");
                break;
            case 'Q': case 'Z':
                System.out.print("10 points");
                break;
        }

    }
}
