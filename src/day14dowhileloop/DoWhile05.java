package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// Kullanicidan ismini alin.
		//Ilk harf b�y�k harf ise ekrana Dogru giris yaptiniz
		//Ilk harf k�c�k ise Ilk harfi b�y�k harf olarak giriniz
		
		Scanner scan = new Scanner(System.in);
		
		String isim="";
		do{
			System.out.print("Isminizi giriniz: ");
			 isim = scan.nextLine();
			 
			 if(isim.charAt(0)>='A'&& isim.charAt(0)<='Z' ){
				 System.out.println("Dogru giris yaptiniz");
			 }else{
				 System.out.println("Ilk harfi b�y�k harf olarak giriniz");
			 }
		}while(!(isim.charAt(0)>='A'&& isim.charAt(0)<='Z' ));

	}

}
