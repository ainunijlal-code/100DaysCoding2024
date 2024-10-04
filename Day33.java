package menti4;

public class Day33 {

    public static void main(String[] args) {

        double angka = 20.34;

        int ubah = (int) angka;//type casting eksplisit(mengonversi tipe data yang lebih besar ke kecil)
        System.out.println(ubah);

        int angka2 = 10;
        double ubah2 = angka2;//type casting implisit(mengonveri tipe data yang lebih kecil ke besar)

        System.out.println(ubah2);
    }
}
