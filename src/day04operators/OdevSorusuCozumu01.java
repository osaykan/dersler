package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
	
		//Kullanicidan int aldiktan sonra String alamiyoruz
		
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Adinizi ve soy adinizi giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		Bu sekilde calismiyor. Önce int varsa sonra String gelirse
	*/	
		
		
		System.out.println("Yasinizi giriniz");
		String yas = scan.nextLine();// int yerine String yaz ve sadece next yazilmaz nextLine olmali. nextInt() ten sonr nextLine() calismiyor
		                             // nextInt yerine nextLine kullan sonra elde ettigin Stringi Integer.parseInt kullanarak integere cevir
		                             //Integer.parseInt()kullanarak integer'a cevir.
		int yeniYas = Integer.parseInt(yas);//String;i tamsayiya cevirme metodu
                                            //Integer.parseInt() sadece rakam iceren Stringler icin calisir.

		
		System.out.println(yeniYas + 1);
		
		System.out.println("Adinizi ve soy adinizi giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		
		
		
		scan.close();
	}

}
