package menti2;

import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int umur = input.nextInt();

        boolean sim = umur > 17;

        System.out.println("Apakaha bisa mendapatkan sim? : " + sim);

    }
}
