package menti3;

public class Day26 {

    public static void main(String[] args) {

        Character huruf1 = 'A';
        Character huruf2 = 'B';

        System.out.printf("huruf1 : %c\n", huruf1);
        System.out.printf("huruf2 : %c\n", huruf2);

        Character temp = huruf2;
        huruf2 = huruf1;
        huruf1 = temp;

        System.out.println("Menukar nilai : ");
        System.out.println("tukar huruf1 : " + huruf1);
        System.out.println("tukar huruf2 : " + huruf2);

    }
}
