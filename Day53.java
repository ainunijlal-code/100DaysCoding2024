
package menti6;

import java.util.Scanner;


public class Day53 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan nilai batas : ");
        int angka = in.nextInt();
        
        for (int i = 1; i <= angka ; i++) {
            if (i % 2 == 0) {
                System.out.println("perulangan ke " + i + " positif");
            }else{
                System.out.println("perulangan ke " + i + " negatif");
            }
        }
    }
}
