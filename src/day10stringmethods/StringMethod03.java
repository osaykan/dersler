package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// charAt() methodu belli indexteki characteri return eder
		
		String str1 = "cimbombom";
		//str1 in 4.indexindeki characteri return eder
		
		System.out.println(str1.charAt(4));  // indexi 4 olan character 'o' harfidir.Ekrana o yazdirir.
		System.out.println(str1.charAt(0));  //indexi 0 olan character 'c' harfidir.Ekrana c yazdirir
//		System.out.println(str1.charAt(10)); // Olmayan bir index ile islem yapmaya calisirsaniz console "Exception alirsiniz.Hata
		
		
		//length() methodu Stringin icinde kac character oldugunu verir
		System.out.println(str1.length()); //Ekrana 9 yazdirir. Adedini verir. index 0 dan baslar fakat lenght 1 den baslar
		
		
		// Soru: Son indexi 9 olan bir Stringin length i kactir?
		//Cevap 10
		// length ==>uzunluk
		
		
		// Kullanicidan ismini girin ve son harfini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String isim = scan.nextLine();
		
		int length= isim.length();
		System.out.println(isim.charAt(length-1));
		
		
		
		
		scan.close();
	}

}
