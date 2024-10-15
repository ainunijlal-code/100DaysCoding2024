package menti5;

public class Day44 {

    public static void main(String[] args) {

        int angka = 10;
        int angka2 = 50;
        System.out.println("Nilai pertama : " + angka);
        System.out.println("Nilai kedua : " + angka2);

        boolean logika = angka > angka2 && angka < angka2;
        boolean logika2 = angka < angka2 && angka2 > angka;

        System.out.println("Jika nilai pertama lebih besar dari nilai kedua dan nilai pertama lebih kecil dari nilai kedua maka hasilnya : " + logika);
        System.out.println("Jika nilai pertama lebih kecil dari nilai kedua dan nilai kedua lebih besar dari nilai pertama maka hasilnya : " + logika2);

    }
}
