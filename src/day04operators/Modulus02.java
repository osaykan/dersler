package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("D�rt basamakli bir tam sayi Giriniz.");
		
		int s = scan.nextInt();
		int sonRakam = s % 10; //1000 e b�l b�l�m ilk basamak
        int ilkRakam = s / 1000;
        
        System.out.println(sonRakam + ilkRakam);
		
		
        scan.close();
		
	}

}
