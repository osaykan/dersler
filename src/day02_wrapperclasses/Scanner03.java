package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		// Kullanicidan alinan bir sayinin küpünü yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println("Sayinin Küpü : " + sayi*sayi*sayi);
		
		
	scan.close();

	}

}
