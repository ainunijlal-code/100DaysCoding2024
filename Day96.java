public class Day96 {
    public static void main(String[] args) {
        int batas = 8;

        
        for (int i = 1; i <= batas; i++) {
            
            for (int j = batas; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = batas - 1; i >= 1; i--) {
            
            for (int j = batas; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
