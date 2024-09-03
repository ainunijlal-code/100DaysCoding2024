package menti;

public class Menti {

    public static void main(String[] args) {

        String namaProduk = "Smartphone";
        String merek = "Samsung";
        int tahunRilis = 2020;
        double harga = 5499.99;
        int kapasitasBaterai = 4500;
        String warna = "Hitam";

        System.out.print("Nama Produk: ");
        System.out.print(namaProduk);
        System.out.print("\n");

        System.out.printf("Merek: %s\n", merek);
        System.out.printf("Tahun Rilis: %d\n", tahunRilis);
        System.out.printf("Harga: Rp%.2f\n", harga);
        System.out.printf("Kapasitas Baterai: %d mAh\n", kapasitasBaterai);
        System.out.printf("Warna: %s\n", warna);
    }

}
