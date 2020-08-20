package java_Review_Turkish;

import java.util.Random;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// Verilen iki sayinin yerlerini degistiriniz
		
		
/*		int num1 = 11; // ==>33
        int num2 = 33; // ==>11
        System.out.println(num1);
        System.out.println(num2);
        int gecici = num1;
        
        
        num1 = num2;
        num2 = gecici;
        System.out.println(num1);
        System.out.println(num2);
  */
		    //*** interview question***
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	/*       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       
	       System.out.println("Önce " +x);
			System.out.println("Önce " +y);
	       
		 x = x+y;
		 y = x-y;
		 x = x-y;
		 System.out.println(x);
		System.out.println(y);
*/		
		//0 ile 1000 arasında random (rastgele) bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
		//random sayi= 185  toplamları = 14
		
/*		int randomSayi = (int)(Math.random()*1000); // 0 <= x < 1000 arasinda rastgele bir deger
	//	int randomSayi = (int)(Math.random()*10)+10;   // 10<= x < 20 arasi degerler
		
    //		Random random = new Random();
    //		int randomSayi = random.nextInt(1000);
		
		System.out.println("Random sayi = "+randomSayi);
		
		int a= randomSayi%10;
        int b = (randomSayi/10)%10;
        int c = randomSayi/100;
        System.out.println(randomSayi + " sayisinin rakamlar toplami : " +(a+b+c));
*/		
		
		/* 
        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020        
        5.Adım Raporu aşağıdaki gibi yazdırınız      
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56        
        */

/*		Scanner scan = new Scanner(System.in);
	
		String ad,soyad,rapor;
		int dyil,syil;
		
		
		System.out.println("Adinizi  giriniz");
		 ad = scan.nextLine();
		
		System.out.println("Soyadinizi  giriniz");
		 soyad = scan.nextLine();
		
		System.out.println("Dogum yilinizi girin");
		 dyil = scan.nextInt();
		System.out.println("Hangi yildasiniz");
		 syil = scan.nextInt();
		
		int yas = syil-dyil;
		rapor ="Adiniz: "+ad+ " Soyadiniz: "+soyad+" Yasiniz: "+yas;
		
		String sifre = yas+ad.substring(0,1)+soyad.charAt(0)+soyad.charAt(soyad.length()-1)+ ad.length()+soyad.length();
		System.out.println("Sifreniz : " +sifre);
*/		
		
//		String str = "Harun";
//		
//		System.out.println(str.substring(0, 3));// Har alinir
//		System.out.println(str.substring(0, 5));// Harun
//		System.out.println(str.substring(1, 3));//ar
//		System.out.println(str.substring(3));// 3. indexten   itibaren sonrasi	
		
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
/*		Scanner scan = new Scanner(System.in);
		
		int saat,dakika,saniye;
		
		System.out.println("Lütfen Saati giriniz.");
		saat = scan.nextInt();
		
		System.out.println("Lütfen dakikayi giriniz.");
		dakika = scan.nextInt();
		
		System.out.println("Lütfen saniyeyi giriniz.");
		saniye = scan.nextInt();
		
		System.out.println("AM veya PM giriniz");
		String str = scan.next();
		
		System.out.println(saat+":"+dakika+":"+saniye+" "+str);
*/		
		// Kullanıcıdan bir sayı girmesini isteyiniz
				// Sayı tek sayı ise "Sayınız tek sayıdır."
				// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tamsayi giriniz");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "Cift sayi": "Tek sayi";
		
		System.out.println(result);
	}

}
