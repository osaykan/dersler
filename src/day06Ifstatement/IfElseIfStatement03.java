package day06Ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
		//Kullanicidan 6 basamakli bir sayi isteyin. 0 ilede baslayabilir
		//Kazanma ihtimali 20% , amorti ihtimali 30% , kaybetme ihtimali 50% olan bir jackpot oyunu icin program yaziniz
		//000000-000001-000002-......-999998-999999 ==> 1000000 sayi var
		
		Scanner scan = new Scanner(System.in);
		System.out.println("6 Basamakli bir sayi giriniz.Sifir basta kullanilabilir");
		
		int num = scan.nextInt();
		
		if(num<200000){
			System.out.println("Kazandiniz");
		}
		else if(num<500000){
			System.out.println("Tekrar Deneyin");
		}
		else{
			System.out.println("Kaybettiniz..");
		}
		
		scan.close();
	}

}
