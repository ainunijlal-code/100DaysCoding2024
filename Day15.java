
package menti2;


public class Day15 {
    public static void main(String[] args) {
        
      
        // Nilai jari-jari lingkaran diinisialisasi di sini
        double jariJari = 13.2; // Ubah nilai jari-jari menjadi 13.2

        // Konstanta untuk nilai PI
        final double pi = 3.14; // Ubah nilai PI menjadi 3.14

        // Menghitung keliling lingkaran (2 * PI * jari-jari)
        double keliling = 2 * pi * jariJari;

        // Menghitung luas lingkaran (PI * jari-jari^2)
        double luas = pi * jariJari * jariJari;

        // Menampilkan hasil perhitungan
        System.out.println("pi : " + pi);
        System.out.println("Jari-jari lingkaran : " + jariJari);
        System.out.println("Keliling lingkaran : " + keliling);
        System.out.println("Luas lingkaran : " + luas);
    }
}

    
