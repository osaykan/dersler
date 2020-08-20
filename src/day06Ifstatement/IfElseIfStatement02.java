package day06Ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		
		//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Sinav Notunu giriniz");
		int not = scan.nextInt();
		
		if(not>100){
			System.out.println("Yanlis Girdiniz");
		}
		else if(not<0){
			System.out.println("Yanlis deger girdiniz");
		}
		else if(not<50){
			System.out.println("Kaldiniz");
		}
		else if(not<80){
			System.out.println("Gectiniz");
		}
		else if(not<=100){
			System.out.println("Tebrikler");
		}
		
		
		
		
		
		
		
		
		scan.close();

	}

}
