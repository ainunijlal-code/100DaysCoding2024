public class Day95 {
    public static void main(String[] args) {
        int tinggi = 10;

        System.out.println("Segitiga Siku-Siku:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Segitiga Siku-Siku Terbalik:");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
