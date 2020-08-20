package day06Ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
	
		
		
		
		
		
	
	//Kullanicidan alacagi urun miktarini ve fiyatini alalim.
		//Eger kullanici 1000 den fazla ürün alirsa 20% indirim yapan ve kullanicinin ödeyecegi toplam fiyati ekrana yazdirin
		// 1000 den az ürün alirsa indirim yapmadan toplam fiyati yazdirin
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ürün miktarini giriniz");
		
		int adet = sc.nextInt();
		System.out.println("Birim fiyatini giriniz");
        double fiyat = sc.nextDouble();
        
        if(adet>1000){
        	System.out.println("Toplam ücretiniz :" + adet*fiyat*0.8);
        }
        else{
        	System.out.println("Toplam ücret :" + adet*fiyat);
        }
      
        sc.close(); 
	}

}
