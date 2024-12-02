import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas tinggi : ");
        int batas = in.nextInt();

        int i = 0;
        while (i < batas) {
            int j = 0;
            while (j < 2 * batas - 1) {
                if (j == i || j == 2 * batas - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
