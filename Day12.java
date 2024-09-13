package menti2;


public class Day12 {
    public static void main(String[] args) {
        
        
        //(Deklarasi tipe data int)
        final int nilai1;
        int nilai2;
        int nilai3;
        
        //(inisalisasi)
        nilai1 = 20;
        nilai2 = 30;
        nilai3 = 40;
        
        //(mencetak nilai dengan println, print, dan printf)
        System.out.println("Kumpulan nilai : ");
        System.out.print("final nilai 1  :  ");//(Mencetak nilai tanpa baris baru yang bersifat final dan sudah tidak dapat di inisialisasi)
        System.out.println(nilai1 );//(Mencetak nilai dengan baris baru)
        System.out.print("Nilai 2 : ");
        System.out.println(nilai2);
        System.out.printf("Nilai 3 : %d \n", nilai3);//(Mencetak nilai dengan format)
        
        //(update)
        nilai2 = 50;
        nilai3 = 100;
        
        //(mencetak hasil update)
        System.out.printf("Nilai update 2 : %d \n",nilai2);
        System.out.printf("Nilai update 3 : %d \n",nilai3);
        
        
       
        
    }
}
