package menti3;

import java.math.BigDecimal;

public class Day30 {

    public static void main(String[] args) {

        // Membuat objek BigDecimal
        BigDecimal angka1 = new BigDecimal("124.486");
        BigDecimal angka2 = new BigDecimal("78.901");

        // Penambahan (add)
        BigDecimal tambah = angka1.add(angka2);

        // Pengurangan (subtract)
        BigDecimal kurang = angka1.subtract(angka2);

        // Perkalian (multiply)
        BigDecimal kali = angka1.multiply(angka2);

        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil penambahan: " + tambah);

    }
}
