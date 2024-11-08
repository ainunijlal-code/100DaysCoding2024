public class Main {
        
        public int tambah(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        return hasil;
    }

    public static void main(String[] args) {
        
        Main jumlah = new Main();

        
        int penjumlahan = jumlah.tambah(5, 100);

        
        System.out.println("Hasil penjumlahan: " + penjumlahan);
    
	}
}
