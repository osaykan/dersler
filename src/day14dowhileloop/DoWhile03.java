package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Kullanicidan sayi alin. Sayi 10 dan k�c�kse ekrana kazandiniz yazdirin
		//Sayi 10 veya b�y�kse ekrana Bir sayi giriniz yazdirin
             Scanner scan = new Scanner(System.in);
             
             int num=0;
             
             do{
            	 System.out.println("Bir sayi giriniz..");   //her durumda burasi calisacak
                 num = scan.nextInt();
            	 
             }while(num>=10);                     //10 dan k�c�k olunca alta iner
             System.out.println("Kazandiniz");
             
             
             
	}

}
