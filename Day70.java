package menti7;

import java.util.Scanner;

public class Day70 {

    // Metode static void dapat dipanggil langsung melalui kelas, tanpa perlu membuat objek untuk mencetak Pola 1 (pola segitiga seperti Pascal)
    public static void cetakPola1(int tinggi) {

        // Loop untuk setiap baris pada pola
        for (int i = 0; i < tinggi; i++) {
            // Menambahkan spasi di awal baris untuk membentuk segitiga
            for (int spasi = 0; spasi < tinggi - i - 1; spasi++) {
                System.out.print(" ");
            }

            int angka = 1; // Angka pertama selalu dimulai dari 1

            // Loop untuk mencetak angka pada setiap baris
            for (int j = 0; j <= i; j++) {
                System.out.print(angka + " "); // Cetak angka diikuti spasi

                // Rumus untuk menghitung angka berikutnya dalam baris (angka di bawah adalah hasil penjumlahan dua angka di atasnya di baris sebelumnya)
                angka = angka * (i - j) / (j + 1);
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }

    // Metode static void dapat dipanggil langsung melalui kelas, tanpa perlu membuat objek untuk mencetak Pola 2 (segitiga terbalik dengan angka menurun)
    public static void cetakPola2(int tinggi) {
        // Cetak angka pertama di bagian atas (angka tertinggi)
        System.out.println(tinggi - 1);

        // Loop untuk setiap baris setelah angka pertama
        for (int i = 0; i < tinggi; i++) {

            // Menambahkan spasi di awal baris untuk membuat segitiga terbalik
            for (int spasi = 0; spasi < i; spasi++) {
                System.out.print(" ");
            }

            // Loop untuk mencetak angka berurutan menurun mulai dari tinggi - 1 sampai nilai i
            for (int j = tinggi - 1; j >= i; j--) {
                System.out.print(j + " "); // Cetak angka dan tambahkan spasi
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Minta input dari pengguna untuk tinggi pola
        System.out.print("Masukkan tinggi pola: ");
        int tinggi = in.nextInt();

        System.out.println("Pola 1:");
        cetakPola1(tinggi); // Panggil metode untuk mencetak Pola 1

        System.out.println("\nPola 2:");
        cetakPola2(tinggi); // Panggil metode untuk mencetak Pola 2

        in.close(); // Tutup scanner
    }
}
