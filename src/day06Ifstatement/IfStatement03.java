package day06Ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		
		// Bir char variable olusturun ve bir buyuk harf deger atayin
				// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
				// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
				// ekrana “Boyle bir gun yok” yazdirin.
		
		char harf = 'T';
		
		if(harf=='P'){
			System.out.println("Pazar,Pazartesi,Persembe");
			
		}
        if(harf=='S'){
	     System.out.println("Sali");
}
		
         if(harf=='C'){
	     System.out.println("Carsamba,Cuma,Cumartesi");
	
}
         
         if(harf!='P'|| harf!='S'||harf!='C'){                   // || veya demek. En az biri true olursa sonuc true olur
        	 System.out.println("Böyle bir gün yok...");         // && ve demek. True sonucunu alabilmek icin tum condition lar true olmali
        	 
         }
	}
	
	
}
