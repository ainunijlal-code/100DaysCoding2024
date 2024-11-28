import java.util.Scanner;

public class KapitalisasiKata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    
   System.out.print("jari-jari : ");
    double r = in.nextDouble();
    System.out.print("tinggi : ");
    double t = in.nextDouble();
    
    double volume = Math.PI * r * r * t;
    
    System.out.println();
    
    System.out.printf("%.2f m kubik", volume);
        
    
    
    }
}
