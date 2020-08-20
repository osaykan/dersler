package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		//Password  4 basamakli bir sayi ise cift olup olmadigini kontrol edin.
		//Cift ise Password tamam yazhdirin , Tek sayi ise Tekrar deneyin yazdirin
		//Password 4 basamakli dagilse Tekrar deneyin yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Paswordunuzu Giriniz..");
		int pass = scan.nextInt();
		
		
		if(pass>999 && pass<10000){
			
			if(pass%2==0){
				System.out.println("Password Tamam..");
				
			}else if(pass%2!=0){
				System.out.println("Tekrar deneyin ilk..");
				
			}
			
		}else{
			System.out.println("Tekrar Deneyin son..");
		}
   scan.close();
	}

}
