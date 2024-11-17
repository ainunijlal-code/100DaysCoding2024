
package menti8;


public class Day77 {
    public static void main(String[] args) {
        
        String hari = "sekarang day 77";
        String hari2 = "SEKARANG DAY 77";
        
        System.out.println("apakah sekarang hari ke 77 : "+ hari.equals(hari2));
        
        String ubah = hari.toUpperCase();
        
        System.out.println("apakah sekarang hari ke 77 : " + hari2.equals(ubah));
    }
 
}
