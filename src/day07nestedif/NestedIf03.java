package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// // Task: Kullanicidan yil girmesini isteyin
		//Girilen yil artik yil ise ekrana "Artik yil " yazdirin
		// Degilse "Artik yil degil yazdirin.
		
		// Artik yil 1) Yil 100 e bölunurse 400 e de bölunmeli  ==> 1300 artik yil degildir. 100 e bölunur ama 400 e bölunmez
		//                                                     ==> 1200 artik yildir  100 e bölunur ve 400 e bölunur
		//           2) Yil 100 e bölunmezse 4 e bölunmeli
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yil Giriniz");
		int yil = scan.nextInt();
		
		
		if(yil%100==0){
			if(yil%400==0){
				System.out.println("Artik yil");
			}else{
				System.out.println("Artik yil degil");
			}
			
		}else if(yil%400!=0){
			if(yil%4==0){
				System.out.println("Artik yil");
			}else{
				System.out.println("Artik yil degil");
			}
		}
		
scan.close();
	}

}
