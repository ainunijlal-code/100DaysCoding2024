package menti4;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("masukkan angka : ");
        int angka = in.nextInt();

        angka %= 2;
        System.out.println("hasil modulo : " + angka);

    }

}
