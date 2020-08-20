package day06Ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
	//Kullanicidan yasini alin . 13 den az ise calisamaz mesaji yazdirin
		//13 den 65 e kadar ise calisabilir yazdirin.
		//Yas 65 den buyukse emekli yazdirin
		//Negatif sayi girerse yas negatif olamaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi Giriniz..");
		
		int yas = scan.nextInt();
		if(yas<0){
			System.out.println("Yas negatif olamaz..");
		}
		
		else if(yas<13){
			System.out.println("Calisamaz");
		}
		
		else if (yas<=65){
			System.out.println("Calisabilir");
			
		}
		else{
			System.out.println("Emekli");
		}
		
		
		
		scan.close();
	}

}
