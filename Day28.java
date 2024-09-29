
package menti3;


public class Day28 {
    public static void main(String[] args) {
        
        Boolean ubah = true;
        
        System.out.println("sebelum ditukar " + ubah);
        
        boolean tukar1 = ubah.booleanValue();
        System.out.println("diubah ke tipe data primitif " +tukar1);
        
        Boolean tukar2 = Boolean.valueOf(tukar1);
        System.out.println("diubah kembali ke tipe data reference " + tukar2);
       
       
    }
}
