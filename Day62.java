
package menti7;

import java.util.Scanner;


public class Day62 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan : ");
        int angka = in.nextInt();
        
        switch (angka){
            case 1:
                System.out.println("nomor 1");
                break;
            case 2:
                System.out.println("nomor 2");
            case 3:
                System.out.println("nomor 3");
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                
                
        }
       
        
        
    }
}
