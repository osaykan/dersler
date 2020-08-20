package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Adinizi ve Soyadinizi Giriniz...");
		
		String isim = scan.nextLine();// Kullanicidan String almak icin ya next() yada nextLine() kullanilir.next sadece tek(ilk) kelimelik Stringler icin.Sadece Osman i alir
		                              // Bosluktan sonrasini almaz.Space görünce Stringi almayi birakir
		                               // nextLine() girilen tüm yaziyi alir
		System.out.println(isim);
		
		
		scan.close();

	}

}
