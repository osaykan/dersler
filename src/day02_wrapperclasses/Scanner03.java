package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		// Kullanicidan alinan bir sayinin k�p�n� yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println("Sayinin K�p� : " + sayi*sayi*sayi);
		
		
	scan.close();

	}

}
