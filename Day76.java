
package menti8;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan inputan kalimat : ");
        String kalimat = in.nextLine();
        System.out.println("Masukkan inputan angka : ");
        int hari = in.nextInt();
        
        if (hari == 76) {
            System.out.println(kalimat.toUpperCase() +" "+ hari);
        }else{
            System.out.println(kalimat.toLowerCase() +" "+ hari);
        }
        
        
    }
}
