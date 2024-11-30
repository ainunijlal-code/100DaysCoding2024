	import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
        Scanner in = new Scanner(System.in);

        
        System.out.print("Masukkan nama Anda: ");
        String nama = in.nextLine();

     
        System.out.print("Masukkan hari ini: ");
        String hari = in.nextLine();

        cetakSalam(nama, hari);
    }
    
    public static void cetakSalam(String nama, String hari) {
        System.out.println("Halo, " + nama + "! Selamat hari " + hari + ".");
    
}
	
}
