package menti;

public class Day4 {

    public static void main(String[] args) {

        final String judul = "Belajar Coding";
        final String pembuat = "programmer";
        final int tahun = 2024;

        double harga = 150000;

        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + pembuat);
        System.out.println("Tahun Terbit: " + tahun);
        System.out.printf("Harga: Rp%,.0f%n", harga);

        harga = 135000;
        System.out.printf("Harga setelah diskon : Rp%,.0f%n", harga);
    }
}
