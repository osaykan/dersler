package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Saati saniyeye, mili km ye kg yi grama ceviren bir method yaziniz
		//Bu methodu main methodunun disinda olusturup main methodunun icinden cagiriniz.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birimi giriniz: ");
		String birim = scan.nextLine();
		System.out.println("Miktari giriniz");
		double miktar = scan.nextDouble();
		
		dönüstürücü(birim,miktar);
		
		scan.close();
	}
	public static void dönüstürücü(String birim, double miktar){
			
		switch(birim){
		
		   case "saat":
			   System.out.println(miktar*60*60);
			   break;
			   
		   case "mil":
			   System.out.println(miktar*1.6);
		       break;
		
		       
		   case "kilogram":
			   System.out.println(miktar*1000);
			   break;
			   
			   default:
				   System.out.println("saat, mil ve kilogramdan baska bir birim girmeyiniz ");
			   
			   
			   
			   
			   
			   
			   
			   
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
