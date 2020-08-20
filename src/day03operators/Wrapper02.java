package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);//Kullanicidan ilk ismini alin ekrana yazdirin.
		                                      //Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.
		
		System.out.println("Adinizi Giriniz...");
		 String ilkIsim = scan.nextLine();
		 
		 System.out.println("Soyisminizi Giriniz");
		String soyIsim = scan.nextLine();
		
          System.out.println(ilkIsim);
          System.out.println(soyIsim);

          scan.close();
	}

}
