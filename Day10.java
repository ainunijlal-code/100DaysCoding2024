package menti;

public class Day10 {

    public static void main(String[] args) {
        
        final int kapasitas_kebun = 200;
        byte tanamanBaru;
        short tanamanSehat;
        int totalTanaman;

        tanamanBaru = 8;
        tanamanSehat = 150;
        totalTanaman = 160;

        System.out.println("Kapasitas maksimal kebun : " + kapasitas_kebun);
        System.out.println("===============================================");
        System.out.println("[1] Tanaman baru ditanam : " + tanamanBaru + " unit");
        System.out.println("[2] Tanaman dalam kondisi sehat : " + tanamanSehat + " unit");
        System.out.println("[3] Total tanaman di kebun : " + totalTanaman + " unit");
        System.out.println("===============================================");
    }
}
