package menti3;

import java.math.BigInteger;

public class Day29 {

    public static void main(String[] args) {

        BigInteger angka1 = new BigInteger("12345");
        BigInteger angka2 = new BigInteger("10000");

        // Mengubah BigInteger ke tipe data int
        int intValue = angka1.intValue();

        // Mengubah BigInteger ke tipe data long
        long longValue = angka2.longValue();

        // Mencetak hasil konversi
        System.out.println("Nilai BigInteger sebagai int: " + intValue);
        System.out.println("Nilai BigInteger sebagai long: " + longValue);

        // Operasi penjumlahan 
        angka1 = angka1.add(angka2); // angka1 = angka1 + angka2
        System.out.println("Hasil bigNumber setelah penjumlahan: " + angka1);

    }
}
