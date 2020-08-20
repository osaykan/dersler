package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	
		
		
		//3 basamakli sayinin rakamlar toplamini bulalim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Üc basamakli bir sayi Giriniz");
		
           int s = scan.nextInt();//123
           
           int sonRakam = s % 10;
           
           int v = s /10;
           int ortaRakam = v % 10;
           
           int ilkRakam = s / 100;
           
           System.out.println(sonRakam +ortaRakam+ilkRakam);
           
           
           scan.close();     
	}

}
