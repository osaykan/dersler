package day06Ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//Kullanicidan bir dikdörtgenin en ve boyunu alin. En ve boy esitse bu bir karedir yazdirin,farkli ise bu bir dikdörtgendir yazdirin
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Lütfen eni giriniz");
		int en = sc.nextInt();
		System.out.println("Lütfen boyunu girin");
		int boy = sc.nextInt();
		
/*		if(boy==en){
			System.out.println("Bu bir Karedir..");
		}
		if(boy!=en){
			System.out.println("Bu bir Dikdörtgendir...");
			
		}
	*/	//else ==> baska diger ihtimallerin tamami
		//En ile boy ya esittir yada degildir.
		
		if(en==boy){
			System.out.println("Bu bir karedir");
			
		}
		else{
			System.out.println("Bu bir dikdörtgendir");
		}
		
		sc.close();
	}

}
