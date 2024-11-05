
package menti7;

import java.util.Scanner;


public class Day65 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah baris : ");
        int angka = in.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
    }
}
