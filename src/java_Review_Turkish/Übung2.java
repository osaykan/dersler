package java_Review_Turkish;

import java.util.Scanner;

public class Übung2 {

	public static void main(String[] args) {
	
	
	/*	a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3 */
		
	/*	System.out.println(-5+8*6);
        System.out.println((55+9)%8);
		System.out.println(20+(-3*5/8));
		System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
		
		System.out.println(Math.pow(2, 3));  // uslü sayilar 2 üssü 3
		System.out.println(Math.sqrt(256));   // Karekök
		System.out.println(Math.round(2.756)); // Yuvarlama
	*/
		//Dikdörtgenin alanını ve çevresini bulunuz
			//çevre = 2*(boy + en)
			//alan = en * boy
	/*		double en = 5.6;
		    double boy = 8.5;
		System.out.println("Alani = " + (en*boy) );
		System.out.println("Cevresi = " + 2*(en+boy));
	*/	
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin boy uzunlugunu giriniz..");
		double en = scan.nextDouble();
		System.out.println("Dikdörtgenin en uzunlugunu giriniz..");
		double boy = scan.nextDouble();
		
		System.out.println("Alan = " + en*boy);
		System.out.println("Cevre = "+ 2*(en+boy));
	*/
		
		//Scanner ile kullanıcıdan 3 sayı girmesini isteyin ve bu sayıların toplamını yazdırınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Üc tane tam sayi giriniz..");
		
		int say1 = scan.nextInt();  // int num1,num2,num3,toplam;
		int say2 = scan.nextInt();   // System.out.println("Üc sayi giriniz)
		int say3 = scan.nextInt();  // Scanner scan =........
		                            // num1 = scan.nextInt()
		int toplam = say1+say2+say3;//num2= scan.nextInt()
		                            //num3 =scan.nextInt()
		System.out.println("Sayilarin Toplami = " + toplam);
		
		
		
		
		
		
		
		
		scan.close();	
	}

}
