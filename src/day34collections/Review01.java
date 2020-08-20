package day34collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// Kullanicidan adini ve soyadini aliniz
				// 1)Ad ve soyadini console’a yazdirin
				// 2)Sadece adini console’a yazdirin
				// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
				// 4)Ad ve soyadini console’a tersten yazdirin
				// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
				//  console’a yazdirin.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen adinizi giriniz");
		String str1 = sc.nextLine();
		System.out.println("Lütfen soy adinizi giriniz");
		String str2 = sc.nextLine();
		
		System.out.println("Adiniz ve soyadiniz: "+str1+" "+str2);
		System.out.println("Adiniz: "+str1);
		System.out.println("Adinizin ilk mharfi: "+str1.charAt(0));
		System.out.println("Soyadinizin ilk mharfi: "+str2.charAt(0));
		
	StringBuilder strB = new StringBuilder(str1+" "+str2);
	System.out.println(strB.reverse());
	
	String tamAd=str1+str2;
	String harfArr[] = tamAd.split("");
	Arrays.sort(harfArr);
	System.out.println(Arrays.toString(harfArr));
	
	
	
	
	
		
	}

}
