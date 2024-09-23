
package menti3;

import java.util.Scanner;


public class Day22 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        Integer angka = input.nextInt();

        System.out.println("mengubah tipe data reference integer menjadi String : " + angka.toString());
    }
}
