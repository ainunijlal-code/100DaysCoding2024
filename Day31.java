
package menti4;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        String angka = in.nextLine();
        int ubah = Integer.parseInt(angka);

        System.out.println("nilai sebelum ditambah :" + angka);

        ubah += 5;
        System.out.println("nilai setelah ditambah :" + ubah);

        System.out.println("Masukkan angka : ");
        String angka2 = in.nextLine();
        double ubah2 = Double.parseDouble(angka);
        System.out.println("nilai sebelum dikali :" + angka2);

        ubah2 *= 3;
        System.out.println("nilai setelah di dikali :" + ubah2);
    }
}
