
package menti2;

import java.util.Scanner;


public class Day16 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
        System.out.print("Masukkan nilai : ");
        int angka = in.nextInt();
        angka += 5;
        System.out.println("Hasil setelah di jumlahkan : " + angka);
    }
}
