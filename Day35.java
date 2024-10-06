
package menti4;

import java.util.Scanner;


public class Day35 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("masukkan angka pertama : ");
        int angka1 = in.nextInt();
        System.out.println("masukkan angka kedua : ");
        int angka2 = in.nextInt();
        
       int jumlah = angka1 + angka2;
       int kurang = angka1 - angka2;
       int kali = angka1 * angka2;
       
        System.out.printf("hasil jumlah : %d\nhasil kurang : %d\nhasil kali : %d\n",jumlah,kurang,kali);
        
        int sisaBagi = angka1 % angka2;
        
        System.out.println("hasil sisa bagi : " + sisaBagi);
    }
 
}
