package day06Ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		//Kullanicidan password girmesini isteyin
		//password dogru ise ekrana “Password dogru” yazdirin
		//password yanlis ise ekrana “Password yanlis tekrar deneyin” yazdirin
		//Dogru password = Java2020

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen passwordu Giriniz..");
		 String passwort = sc.nextLine();
		 //Stringlerin esitligini kontrol ederken asla == sembolü kullanmayin.Onun yerine equals kullanin
		 // == metodu deger ve adresi kontrol eder
		 // equals sadece degeri kontrol eder.
		 if(passwort.equals("Java2020")){
			 System.out.println("Password dogru");
			 
		 }
		   else{
			 System.out.println("Password yanlis");
		 }
		 sc.close();
		
	}

}
