package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
	
		//Ikitane variable nin degerlerini yer degistiriniz
		//sayi1=2, sayi2 =30 ==> sayi1=30, sayi2=12(Bu isleme swap denir)
		
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("Yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		//1.Yol
		System.out.println("Yer degistirmeden önce:");
		System.out.println(sayi1);//10.0
		System.out.println(sayi2);//30.0
		
		double gecici = 0.0;//Bos kap
		gecici = sayi1;               // variable olustururken data type sadece bir kez yazilir birdaha double ye gerek yok
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("Yer degistirdikten sonra:");
		System.out.println(sayi1);//30.0
		System.out.println(sayi2);//10.0		
	*/	
		//2.Yol
		System.out.println("Yer degistirmek icin iki sayi daha giriniz");
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		System.out.println("Degisimden önce");
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		sayi3 = sayi3+sayi4;// 
		sayi4 = sayi3-sayi4;
		sayi3 = sayi3-sayi4;
		System.out.println("Degisimden sonra");
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		
		
		
		
		scan.close();

	}

}
