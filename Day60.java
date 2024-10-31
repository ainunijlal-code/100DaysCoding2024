
package menti6;

import java.util.Scanner;


public class Day60 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int angka;
        
        
        do{
           System.out.println("Masukkan angka : ");
        angka = in.nextInt();
        }while(angka >= 100 && angka <= 200);
        System.out.println(angka);
    
        
    
    }
}
