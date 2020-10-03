package be.kdg.prog.m2;

public class Variables {
    public static void main(String[] args) {
        boolean Boo = true;
        char Character = 'A';
        byte Baite = 1;
        short Sort = 15;
        int Intt = 14;
        long Loong = 13;
        float Flhoat = 13.3F;
        double Dable = 12;

        System.out.println("Boolean: " + Boo);
        System.out.println("Char: " + Character);
        System.out.println("Byte: " + Baite);
        System.out.println("Short: " + Sort);
        System.out.println("Int: " + Intt);
        System.out.println("Long: " + Loong);
        System.out.println("Float: " + Flhoat);
        System.out.println("Double: " + Dable);

        final double PI = 3.14;
//        PI = 3.1415926536;  Invalid statement because final keyword makes variable PI constant
    }
}
