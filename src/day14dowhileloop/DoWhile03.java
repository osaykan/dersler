package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Kullanicidan sayi alin. Sayi 10 dan kücükse ekrana kazandiniz yazdirin
		//Sayi 10 veya büyükse ekrana Bir sayi giriniz yazdirin
             Scanner scan = new Scanner(System.in);
             
             int num=0;
             
             do{
            	 System.out.println("Bir sayi giriniz..");   //her durumda burasi calisacak
                 num = scan.nextInt();
            	 
             }while(num>=10);                     //10 dan kücük olunca alta iner
             System.out.println("Kazandiniz");
             
             
             
	}

}
