package menti5;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int angka = in.nextInt();
        int angka2 = in.nextInt();

        if (angka > 0 || angka2 > 0) {
            System.out.println("Bernilai positif");
        }
        if (angka < 0 && angka2 < 0) {
            System.out.println("Bernilai negatif");
        }

    }
}
