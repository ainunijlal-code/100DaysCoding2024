package menti;

public class Day7 {

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel final
        final int TAHUN_SEKARANG = 2024; // final variabel (nilai tidak bisa diubah)
        final int tahunLahir = 2005;
        int usia = 19; // menghitung usia berdasarkan tahun sekarang

        // Menggunakan println untuk menampilkan output
        
        System.out.printf("%s\n", "----------------------------------");
        System.out.println("Tahun sekarang: " + TAHUN_SEKARANG);
        System.out.printf("%s\n", "----------------------------------");
        System.out.println("Tahun lahir: " + tahunLahir);
        System.out.printf("%s\n", "----------------------------------");
        System.out.printf("Usia saat ini: %d tahun\n", usia);
        System.out.printf("%s\n", "----------------------------------");
    }
}
