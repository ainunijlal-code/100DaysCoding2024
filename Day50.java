
package menti5;

import java.util.Scanner;


public class Day50 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan nilai : ");
        int angka = in.nextInt();
        
        System.out.println("Hasil operator penugasan : ");
        angka *= 5;
        angka -= 10;
        System.out.println(angka);
        
        if (angka >= 10 && angka != 0) {
            System.out.println("Hasil lebih dari sama dengan 10 = " + angka);
        }else if (angka == 0) {
            System.out.println("sama dengan = " + angka);
        }else{
            System.out.println("Hasil kurang dari 10 = " + angka);
        }
    }
}
