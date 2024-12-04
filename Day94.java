package menti9;

import java.util.Scanner;

public class Day94 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan batas tinggi : ");
        int batas = in.nextInt();

        int i = 1;
        while (i <= batas) {

            int j = 1;
            while (j <= batas - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }

        in.close();
    }
}
