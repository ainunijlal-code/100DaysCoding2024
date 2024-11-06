
package menti7;


public class Day66 {
    public static void main(String[] args) {
        
        int sisi = 5;
        int panjang = 10;
        int lebar = 3;
        
        System.out.println("Persegi : ");
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Persegi Panjang : ");
        
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
