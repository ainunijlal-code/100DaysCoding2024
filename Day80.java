
package menti8;

public class Day80 {
    public static void main(String[] args) {
        
        String sandi = "password";
        String input = " password ";
        
        if (sandi.equals(input.trim())) {
            System.out.println("Login berhasil");
        }else {
            System.out.println("Login gagal");
        }
    }
 
}
