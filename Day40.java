package menti4;

public class Day40 {

    public static void main(String[] args) {

        int angka = 30;
        int angka2 = 10;

        boolean kurangDari = angka < angka2;
        boolean lebihDari = angka > angka2;

        System.out.println("apakah nilainya kurang dari : " + kurangDari);
        System.out.println("apakah nilainya lebih dari : " + lebihDari);
        System.out.println("--------------------------");

        angka = 50;
        angka2 = 100;

        boolean hasil = angka < angka2;
        boolean hasil2 = angka > angka2;

        System.out.println("Hasil operator perbandingan setelah update : ");
        System.out.println("apakah nilainya kurang dari : " + hasil);
        System.out.println("apakah nilainya lebih dari : " + hasil2);

    }
}
