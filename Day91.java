
package menti9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day91 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int jumlahKalimat = Integer.parseInt(in.nextLine());
        String[] daftarKalimat = new String[jumlahKalimat];
        
        for (int i = 0; i < jumlahKalimat; i++) {
            daftarKalimat[i] = in.nextLine();
        }
        
        String pola = "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern pencocok = Pattern.compile(pola, Pattern.CASE_INSENSITIVE);
        
        for (int i = 0; i < jumlahKalimat; i++) {
            Matcher hasilCocok = pencocok.matcher(daftarKalimat[i]);
            String hasil = hasilCocok.replaceAll("$1");
            System.out.println(hasil);
        }
        
        in.close();
    }
}
