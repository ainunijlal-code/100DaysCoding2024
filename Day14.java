package menti2;

public class Day14 {

    public static void main(String[] args) {

        //Persegi Panjang
        // Mendeklarasi variabel panjang dan lebar Persegi Panjang
        double panjang = 8.5;
        double lebar = 5.0;

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("=================================");
        System.out.println("luas dan keliling persegi panjang");
        System.out.println("=================================");
        System.out.println("Panjang\t\t: " + panjang + " cm");
        System.out.println("Lebar\t\t: " + lebar + " cm");
        System.out.println("---------------------------------");
        System.out.println("Rumus Luas\t= Panjang X Lebar");
        System.out.println("Rumus Keliling\t= 2 X (Panjang + Lebar)");
        System.out.println("Luas\t\t: " + luas + " cm^2");
        System.out.println("Keliling\t\t: " + keliling + " cm");
        System.out.println("=================================");
    }
}
