package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		                            // Ternary Operator (If Else If)
		
		//Kullanicidan bir sayi aliniz
		//Sayi 0 dan b�y�k esit ise 10 dan k�c�k olup olmadigini kontrol ediniz
		//10 dan k�c�k ise ekrana Rakam yazdirin degilse Pozitif sayi yazdirin
		//Sayi negatif ise ekrana Negatif Sayi yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Tam Sayi Giriniz");
		int num = scan.nextInt();
		
		 String result = num>=0 ? (num<10 ? "Rakam" : "Pozitif Sayi") : "Negatif";
		System.out.println(result);

		
		scan.close();
	}

}
