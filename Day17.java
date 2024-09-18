package menti2;

public class Day17 {

    public static void main(String[] args) {

        // String yang akan dikonversi
        String ubah1 = "200";
        String ubah2 = "45.67";
        String ubah3 = "true";

        // Konversi String ke tipe data int
        int angka = Integer.parseInt(ubah1);

        // Konversi String ke tipe data double
        double desimal = Double.parseDouble(ubah2);

        // Konversi String ke tipe data boolean
        boolean nilaiBoolean = Boolean.parseBoolean(ubah3);

        //mencetak nilai konversi
        System.out.println("Hasil konversi ke boolean: " + nilaiBoolean);
        System.out.println("Hasil konversi ke int: " + angka);
        System.out.println("Hasil konversi ke double: " + desimal);
    }
}
