package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
	
		//Dairenin alanini ve cevresini bulacagiz
		/*
		Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan 
		bir program yazınız. (float kullanınız)
		Not 1: pi sayısı: 3.14159
		Not 2: Alan: 3.14159 x radius x radius
		Not 3: Cevre: 2 x 3.14159 x radius */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin Yaricapini Giriniz .");
		
		double yaricap = scan.nextDouble();
		
		System.out.println("Dairenin Alani :" + 3.14159*yaricap*yaricap);
		System.out.println("Dairenin Cevresi : " + 2*3.14159*yaricap);
		
		
		scan.close();	

	}

}
