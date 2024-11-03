
package menti7;

import java.util.Scanner;


public class Day63 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan nilai : ");
        int angka = in.nextInt();
        
        for (int i = 0; i < angka; i++) {
        if (i == 5) {
            System.out.println("Day 63");
            continue;
        }
        System.out.println("Urutan ke-"+i);
        }
        
    }
}
