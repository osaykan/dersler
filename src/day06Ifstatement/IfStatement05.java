package day06Ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//Kullanicidan bir dikd�rtgenin en ve boyunu alin. En ve boy esitse bu bir karedir yazdirin,farkli ise bu bir dikd�rtgendir yazdirin
		
		Scanner sc = new Scanner(System.in);

		System.out.println("L�tfen eni giriniz");
		int en = sc.nextInt();
		System.out.println("L�tfen boyunu girin");
		int boy = sc.nextInt();
		
/*		if(boy==en){
			System.out.println("Bu bir Karedir..");
		}
		if(boy!=en){
			System.out.println("Bu bir Dikd�rtgendir...");
			
		}
	*/	//else ==> baska diger ihtimallerin tamami
		//En ile boy ya esittir yada degildir.
		
		if(en==boy){
			System.out.println("Bu bir karedir");
			
		}
		else{
			System.out.println("Bu bir dikd�rtgendir");
		}
		
		sc.close();
	}

}
