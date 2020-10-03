package be.kdg.prog.m2;

public class Numbers {
    public static void main(String[] args) {

        // Part 1
        long Number1 = 2000000000;
        long Number2 = 2000000000;
        long Sum = Number1 + Number2;

        System.out.println("Sum: " + Sum);

        // Part 2
        long Long1 = 10000;
        long Long2 = 10000;
        int Sum2 = (int) (Long1 + Long2);

        System.out.println("Sum2: " + Sum2);

        // Part 3
        int first = 8;
        int second = 5;
        int Sum3 = first + second;
        int Difference = first - second;
        int Product = first * second;
        int Quotient = first / second;
        int Remainder = first % second;

        System.out.println("Sum: " + Sum3);
        System.out.println("Difference: " + Difference);
        System.out.println("Product: " + Product);
        System.out.println("Quotient: " + Quotient);
        System.out.println("Remainder: " + Remainder);

        // Part 4
        /* If operator is before variable => before expression evaluated
           If operator is after variable => after expression is evaluated
         */

        int result = ++first;
        System.out.println("Result: " + result);

        result = first++;
        System.out.println("Result: " + result);

        result = --second;
        System.out.println("Result: " + result);

        result = second--;
        System.out.println("Result: " + result);

    }
}
