package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//Kullanici iki tam sayi versin
		//Program bu tamsayilarin toplamini ve carpimini yazdirsin
		
		Scanner scan = new Scanner(System.in);// Scanner in altindaki kirmizi cizginin üzerinde dur import et
		
       System.out.println("Lütfen Iki Tamsayi Giriniz.");
		
       int sayi1 = scan.nextInt();
       int sayi2 = scan.nextInt();
       
       System.out.println("Toplam : " + (sayi1 + sayi2));
       System.out.println("Carpim : " + (sayi1 * sayi2));
       
       
       
       scan.close();
       
	}

}
