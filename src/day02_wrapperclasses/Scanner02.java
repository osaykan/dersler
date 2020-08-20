package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);// Kirmizidan dolayi import et
		
		System.out.println("Lütfen Karenin bir kenar uzunlugunu giriniz.");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println("Karenin cevre Uzunlugu : " + (4*kenarUzunlugu));
       System.out.println("Alani: " + (kenarUzunlugu*kenarUzunlugu));
       
       
       scan.close();
	}

}
