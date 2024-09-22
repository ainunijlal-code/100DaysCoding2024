package menti3;

public class Day21 {

    public static void main(String[] args) {
        
        Short angka = 20; // Mendeklarasikan dan menginisialisasi objek Short

        System.out.println("Nilai Short: " + angka); // Mencetak nilai objek Short

        // Mengubah objek Short menjadi String
        String stringValue = angka.toString();
        System.out.println("Diubah menjadi tipe data String: " + stringValue);

        // Mengubah objek Short menjadi float
        float floatValue = angka.floatValue(); // Menggunakan metode untuk mengubah nilai objek Short ke tipe float
        System.out.println("Diubah menjadi tipe data float: " + floatValue);

    }
}
