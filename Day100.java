package menti9;

import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = in.nextLine();

        int jam = LocalTime.now().getHour();

        String salam;
        if (jam < 12) {
            salam = "Selamat pagi";
        } else if (jam >= 12 && jam <= 17) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        // Menampilkan pesan
        System.out.println("==============================");
        System.out.println("  " + salam + ", " + nama);
        System.out.println("  Program Anda Telah Selesai");
        System.out.println("==============================");

        in.close();
    }
}
