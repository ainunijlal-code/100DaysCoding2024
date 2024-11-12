
package menti8;


public class Day72 {
    
    public static int jumlah(int n){
        if (n == 1) {
            return 1;
        }
        else{
            return n + jumlah(n - 1);
        }
            
    }
    
    public static void main(String[] args) {
        int angka = 5;
        int hasil = jumlah(angka);
        System.out.println("hasil penjumlahan dari 1 - "+angka+" = "+ hasil);
    }
}
