package menti;

public class Menti {

    public static void main(String[] args) {
        //(Pertama mendeklarasikan variabel bernama var1 dan var2 dengan tipe data String)
        String var1, var2;//(Mendeklarasikan variabel bernama var1 dan var2)

        //(Lalu menginisialisasi variabel var3, var4, dan var5 dengan mendeklarasikannya menggunakan tipe data byte, short, dan int)
        byte var3 = 20;//(Mendeklarasikan dan menginisialisasi variabel dengan nilai 20)
        short var4 = 30;//(Mendeklarasikan dan menginisialisasi variabel dengan nilai 30)
        final int var5 = 40;//(Mendeklarasikan variabel sebagai konstanta(final) dengan nilai 40)
        
        //(menginisialisasi variabel bernama var1 dan var2 setelah mendeklarasikannya dengan tipe data String)
        var1 = "Belajar";//(Menginisialisasi tipe data String yang telah dideklarasikan)
        var2 = "Coding";//(Menginisialisasi tipe data String yang telah dideklarasikan)

        //(Mencetak semua nilai dari deklarasi dan inisialisasi di atas)
        System.out.printf("Hasil var1 : %s\n", var1);//(Mencetak hasil dari deklarasi dan inisialisasi variabel var1 dalam bentuk format printf)
        System.out.printf("Hasil var2 : %s\n", var2);//(Mencetak hasil dari deklarasi dan inisialisasi variabel var2 dalam bentuk format printf)
        System.out.printf("Hasil var3 : %d\n", var3);//(Mencetak hasil dari deklarasi dan inisialisasi variabel var3 dalam bentuk format printf)
        System.out.printf("Hasil var4 : %d\n", var4);//(Mencetak hasil dari deklarasi dan inisialisasi variabel var4 dalam bentuk format printf)
        System.out.printf("Hasil var5 : %d (final)\n", var5);//(Mencetak hasil dari deklarasi dan inisialisasi variabel var5 dalam bentuk format printf dan sebagai konstanta(final))

        //(Mengupdate nilai dari beberapa variabel)
        var1 = "semangat";//(Mengupdate variabel bernama var1)
        var2 = "belajar";//(Mengupdate variabel bernama var2)
        var3 = 50;//(Mengupdate variabel bernama var3)
        var4 = 100;//(Mengupdate variabel bernama var4)
        //(Untuk variabel bernama var5 setelah dideklarasikan menggunakan final(konstanta) maka hanya dapat di inisialisasi sekali)

        //(Mencetak semua nilai hasil update nilai di atas)
        System.out.printf("Hasil update var1 : %s\n", var1);//(Mencetak hasil update dalam bentuk format printf)
        System.out.printf("Hasil update var2 : %s\n", var2);//(Mencetak hasil update dalam bentuk format printf)
        System.out.printf("Hasil update var3 : %d\n", var3);//(Mencetak hasil update dalam bentuk format printf)
        System.out.printf("Hasil update var4 : %d\n", var4);//(Mencetak hasil update dalam bentuk format printf)

    }

}
