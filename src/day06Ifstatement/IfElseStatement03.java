package day06Ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
	
		
		
		
		
		
	
	//Kullanicidan alacagi urun miktarini ve fiyatini alalim.
		//Eger kullanici 1000 den fazla �r�n alirsa 20% indirim yapan ve kullanicinin �deyecegi toplam fiyati ekrana yazdirin
		// 1000 den az �r�n alirsa indirim yapmadan toplam fiyati yazdirin
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�r�n miktarini giriniz");
		
		int adet = sc.nextInt();
		System.out.println("Birim fiyatini giriniz");
        double fiyat = sc.nextDouble();
        
        if(adet>1000){
        	System.out.println("Toplam �cretiniz :" + adet*fiyat*0.8);
        }
        else{
        	System.out.println("Toplam �cret :" + adet*fiyat);
        }
      
        sc.close(); 
	}

}
