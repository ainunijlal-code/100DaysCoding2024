package menti;


public class Day8 {
    public static void main(String[] args) {
        
        // Deklarasi variabel
        byte jumlahMobil;
        short jumlahSepedaMotor;
        int jumlahKendaraanTotal;

        // Inisialisasi variabel
        jumlahMobil = 30; // Jumlah mobil
        jumlahSepedaMotor = 120; // Jumlah sepeda motor
        jumlahKendaraanTotal = 150; // Total kendaraan

        // Menampilkan informasi kendaraan dalam format tabel
        System.out.print("| mobil    : "+ jumlahMobil +"  ||");
        System.out.print("| sepeda motor : "+ jumlahSepedaMotor +"  |");
        System.out.print("|| total kendaraan : "+ jumlahKendaraanTotal +"  |\n");
    }
}
