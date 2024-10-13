package menti5;

public class Day42 {

    public static void main(String[] args) {

        int angka = 30;
        int angka2 = 40;

        System.out.println("Angka awal pertama : " + angka);
        System.out.println("Angka awal kedua : " + angka2);

        angka *= 3;
        angka2 *= 3;

        System.out.println("hasil operator penugasan pertama : " + angka);
        System.out.println("hasil operator penugasan kedua : " + angka2);

        System.out.println("Apakah hasil pertama sama dengan yang kedua : " + (angka == angka2));
        System.out.println("Apakah hasil pertama tidak sama dengan yang kedua : " + (angka != angka2));
    }
}
