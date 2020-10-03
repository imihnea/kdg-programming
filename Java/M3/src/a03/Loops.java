package a03;

public class Loops {
    public static void main(String[] args) {

        // Task 1

        System.out.println("------------------ Task 1 ------------------");

        int a = 120;
        while (a >= 100) {
            System.out.println(a);
            a--;
        }

        a = 1;
        while (a < 50) {
            if(a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }

        a = 5;
        while (a < 10000) {
            double j = Math.log(a) / Math.log(5);
            if(j == Math.floor(j)) System.out.println(a);
            a++;
        }

        char b = 'A';
        while (b <= 'Z') {
            System.out.print(b);
            b++;
        }

        // Task 2

        System.out.println("\n------------------ Task 2 ------------------");

        int c = 120;
        do {
            System.out.println(c);
            c--;
        }
        while (c >= 100);

        c = 1;
        do {
            if(c % 3 == 0) {
                System.out.println(c);
            }
            c++;
        }
        while (c < 50);

        c = 5;
        do {
            double j = Math.log(c) / Math.log(5);
            if(j == Math.floor(j)) System.out.println(c);
            c++;
        }
        while (c < 10000);

        char d = 'A';
        do {
            System.out.print(d);
            d++;
        }
        while (d <= 'Z');

        // Task 3

        System.out.println("\n------------------ Task 3 ------------------");

        for (int i = 120 ; i >= 100; i--) {
            System.out.println(i);
        }

        for (int i = 1 ; i < 50 ; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 5 ; i < 10000 ; i++) {
            double j = Math.log(i) / Math.log(5);
            if(j == Math.floor(j)) System.out.println(i);
        }

        for (char i = 'A' ; i <= 'Z'; i++) {
            System.out.print(i);
        }
    }
}
