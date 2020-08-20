package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 4,3 ve 2 yi ekrana yazdiran bir for loop olusturun
		
		
//		for(int i = 4; i>1; i--) {
//			
//			System.out.println(i);
				
//		}
		
		// 3 , 4, 5, 6, 7 
//		
//		for(int i=3 ; i<8 ; i++) {
//			System.out.println(i);
//		}
		//Ilk 100 sayma sayisini ekrana yanyana yazdiran ve aralarina bosluk koyan program
		
		for(int i =1; i<=100; i++) {
			System.out.print(i+" ");
			
			
		}
		System.out.println();//üstteki guruptan ayirmak icin
		
	// Ilk 50 cift sayma sayisini ekrana yazdir
		
		for(int i = 2; i<101; i=i+2){
			System.out.print(i+" ");
			
		}
		System.out.println();//üstteki gruptan ayirmak icin yazdik
		//ilk 50 tek sayma sayisi
		
		for(int i = 1; i<=101; i+=2){
			
			System.out.print(i+" ");
		}
			

	}

}
