
package menti8;

import java.util.Scanner;


public class Day79 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Indonesia : ");
        int nilai = in.nextInt();
        System.out.println("Arab Saudi : ");
        int nilai2 = in.nextInt();
        
        System.out.println("Hasil Skor : " + Integer.toString(nilai) + "-" + Integer.toString(nilai2));
    }
}
