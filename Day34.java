package menti4;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan angka : ");
        double angka = in.nextDouble();
        
        angka += 11;
        angka -= 3;
        
        String ubah = Double.toString(angka);
        
        System.out.println("setelah diubah ke string : "+ ubah);
        
    }
}
