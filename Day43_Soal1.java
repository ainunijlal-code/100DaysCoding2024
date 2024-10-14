package menti5;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input Jari-jari\t: ");
        int jariJari = in.nextInt();
        System.out.print("Input satuan\t: ");
        String satuan = in.next();

        final double PI = 3.14159;
        double keliling = 2 * PI * jariJari;
        double luas = PI * jariJari * jariJari;

        System.out.println("=========================HASIL====================");
        System.out.println("Jari-jari\t: " + jariJari + " " + satuan);
        System.out.println("Keliling\t\t: " + keliling + " " + satuan);
        System.out.println("Luas\t\t: " + luas + " " + satuan + "^2");
    }
}
