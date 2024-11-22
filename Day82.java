public class Main {
	public static void main(String[] args) {
		
		double nilai = 5.5;
		double nilai2 = 7.3;
		
		double hasil = nilai + nilai2;

        System.out.println("Nilai hasil jumlah: " + hasil);

        System.out.println("dibulatkan ke atas: " + Math.ceil(hasil));
        System.out.println("dibulatkan ke bawah: " + Math.floor(hasil));
        System.out.println("dibulatkan ke angka terdekat: " + Math.round(hasil));
	}
}
