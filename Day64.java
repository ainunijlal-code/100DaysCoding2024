package menti7;

public class Day64 {

    public static void main(String[] args) {

        henti:
        for (int i = 1; i < 10; i++) {
            System.out.println("Day 63 ke-" + i);

            for (int j = 1; j < 10; j++) {
                System.out.println("Day 64 ke-" + j);

                if (j == 5) {
                    break henti;
                }
                
            }
        }
    }
}
