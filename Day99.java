import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Kalkulator dan Operasi Lain ===");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Total penjumlahan bilangan genap dari x ke y");

        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = in.nextInt();

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = in.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = in.nextDouble();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
            }
        } else if (pilihan == 5) {
            System.out.print("Masukkan angka awal (x): ");
            int x = in.nextInt();

            System.out.print("Masukkan angka akhir (y): ");
            int y = in.nextInt();

            int total = 0;

            for (int i = x; i <= y; i++) {
                if (i % 2 == 0) {
                    total += i;
                }
            }

            System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        in.close();
    }
}
