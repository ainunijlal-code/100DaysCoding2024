package menti5;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nilai pertama : ");
        int angka = in.nextInt();
        System.out.println("Masukkan nilai kedua : ");
        int angka2 = in.nextInt();
        System.out.println("cek : ");
        boolean cek = in.nextBoolean();

        if (cek == true && angka > 10 && angka2 < 100) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }

    }
}
