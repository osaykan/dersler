package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
        //Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul Turkiye)
        //Kullanicidan yasini alalim ekrana yazdiralim.
        //Kullaniciya "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana yazdiralim
        //true veya false olarak
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi ve Soyadinizi Giriniz..");
		String adiSoyadi = scan.nextLine();
		System.out.println("Adi ve Soyadiniz : " + adiSoyadi);
		
		System.out.println("L�tfen Adresinizi Girin..");
		String adres = scan.nextLine();
		System.out.println("Adres : " + adres);
		
		System.out.println("Yasinizi Giriniz..");
		byte yas = scan.nextByte();
		System.out.println("Yas : " + yas);
		
		System.out.println("T�rkiyede mi Yasiyorsunuz..true/false");
		boolean isTurkey = scan.nextBoolean();
		System.out.println("Turkiyedemi Yasiyorsunuz : " + isTurkey);
		
		
       /* Scanner scan = new Scanner(System.in);
        
        System.out.println("Ad ve soyadinizi giriniz");
        String tamIsim = scan.nextLine();
        System.out.println(tamIsim);
        
        System.out.println("Adresinizi giriniz");
        String adres = scan.nextLine();
        System.out.println(adres);
        
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println(yas);
        
        System.out.println("Turkiye'de yasiyorum. true/false");
        boolean blTr = scan.nextBoolean();
        System.out.println(blTr);*/

		
		
		
		
		
		
		
		
		scan.close();
	
	}

}
