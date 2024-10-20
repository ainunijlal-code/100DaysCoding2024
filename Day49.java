package menti;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nilai pertama : ");
		int angka = in.nextInt();
		  System.out.println("Nilai kedua : ");
		int angka2 = in.nextInt();
		
		if(angka < angka2){
		    System.out.println("kurang dari");
		}else if(angka > angka2){
		    System.out.println("lebih dari");
		}
		
	}
}
