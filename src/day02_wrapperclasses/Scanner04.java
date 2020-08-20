package day02_wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Dikdörtgenin En ve Boyunu Girin");
	
		
		int boy = scan.nextInt();
		int en = scan.nextInt();
		
		System.out.println("Dikdörtgenin Alani : " + ( boy*en));
		System.out.println("Dikdörtgenin Cevresi : " + 2*( boy+en));
		
		scan.close();
	}

}
