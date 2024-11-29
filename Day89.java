package menti9;

import java.util.Scanner;

public class Day89 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan kata : ");
        String kata = in.nextLine();

        if (kata.length() > 100) {
            System.out.println("inputan melebihi 100 karakter");
        } else {
            StringBuilder balik = new StringBuilder(kata).reverse();

            boolean cek = kata.equals(balik.toString());

            if (cek) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
