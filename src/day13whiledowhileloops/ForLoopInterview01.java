package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		//Kullanicidan bir String alin ve bu Stringi ekrana tersten yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cümle  veya kelime giriniz");
		
		String str = scan.nextLine();   //Ali Can 7 karakter var. 6.indexten  basla sifira kadar düs.
		
		for(int i =str.length()-1;i>=0;i--){
			
			System.out.print(str.charAt(i));
	}
		 
	scan.close();	
	}

}
