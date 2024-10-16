package menti5;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka pertama : ");
        int angka = in.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka2 = in.nextInt();

        boolean logika = angka > angka2 || angka == angka2;

        System.out.println("Jika angka pertama lebih besar dari angka kedua atau angka pertama sama dengan angka kedua hasilnya : " + logika);

    }
}
