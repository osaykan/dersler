package day06Ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	//Task==>Görev : Bir variable olusturun ,deger cift ise ekrana cift yazdirin. Sayi tek ise ekrane tek yazdirin
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayi giriniz.."); 
		int num = sc.nextInt();
		
		if(num%2==0){

			
			System.out.println("Sayi cift...");
		}
		if(num%2!=0){
			System.out.println("Sayi tek.....");
		}

		
		sc.close();
	}

}
