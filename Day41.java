
package menti5;

import java.util.Scanner;


public class Day41 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan angka 1 : ");
        int angka = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka2 = in.nextInt();
        
        int aritmatika = angka + angka2;
        int aritmatika2 = angka - angka2;
        System.out.println("hasil penjumlahan : " + aritmatika);
        System.out.println("hasil pengurangan : " + aritmatika2);
        
        aritmatika *= 5;
        aritmatika2 *= 5;
        
        System.out.println("Hasil operator penugasan perkalian 1 : " + aritmatika);
        System.out.println("Hasil operator penugasan perkalian 2 : " + aritmatika2);
        
        System.out.println("apakah hasil operator perkalian 1 lebih besar dari operator perkalian ke 2 : " + (aritmatika > aritmatika2));
        System.out.println("apakah hasil operator perkalian 1 lebih kecil dari operator perkalian ke 2 : " + (aritmatika < aritmatika2));
    }
}
