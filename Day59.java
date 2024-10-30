package menti6;

public class Day59 {

    public static void main(String[] args) {

        int angka = 1234567;
        String ubah = String.valueOf(angka);

        for (char i : ubah.toCharArray()) {
            System.out.println("Digit: " + i);
        }
    }
}
