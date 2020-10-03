package a01;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int Age = keyboard.nextInt();

        System.out.print("You are a ");

        if(Age < 2) {
            System.out.print("baby");
        } else if(Age >= 2 && Age <= 12) {
            System.out.print("child");
        } else if(Age >= 13 && Age <= 17) {
            System.out.print("teenager");
        } else if(Age >= 18) {
            System.out.print("adult");
        }
    }
}
