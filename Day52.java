package menti6;

import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Tanggal hari ini : ");
        int angka = in.nextInt();

        String hasil = (angka == 52) ? "Sekarang sudah hari ke 52" : "Tidak sesuai dengan hari ini";
        System.out.println(hasil);

    }
}
