package day06Ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
	//Kullanicidan bir tam sayi isteyin ve o tamsayinin mutlak degerini ekrana yazdirin
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayi giriniz");
		int num = sc.nextInt();
		
		if(num>=0){
			System.out.println("Sayinin mutlak degeri :" + num);
		}
		else{
			System.out.println("Sayinin mutlak degeri :" + (-1)*num);
		}
		
		sc.close();

	}

}
