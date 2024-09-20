package menti2;

public class Day19 {

    public static void main(String[] args) {

        String teks = "Belajar";//teks adalah variabel reference ke objek String
        String teks2 = "Coding";

        String gabung = teks + " " + teks2;//menggabungkan string
        System.out.println(gabung);

        boolean cek = gabung.contains("Belajar");//mengecek substring Belajar menggunakan method contains 
        System.out.println(cek);
    }
}
