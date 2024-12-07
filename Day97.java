package menti9;

import java.util.Scanner;

public class Day97 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan prima dari 1 - " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean prima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
