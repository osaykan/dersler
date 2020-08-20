package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve tersini ekrana yazdirin
		//Bu sayinin tersinin 2 fazlasini ekrana yazdir
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz..");
		String num = scan.nextLine();
		
		String ters = "";                          //int sum = 0;
		
		for(int i = num.length()-1;i>=0;i--){
			ters =ters+ num.charAt(i)+ "";         //char i stringe cevirmek icin sonuna + "" ekledik   sum=sum+i
			
		}
//		System.out.println(ters);
        
		int tersInt = Integer.valueOf(ters);
		tersInt = tersInt+2;
		System.out.println(tersInt);
		
		scan.close();
	}

}
