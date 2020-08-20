package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan  bir sayi alin. Bu sayi pozitif ise 9 dan buyukmu diye kontrol rdin, 9 dan büyükse ekrana sayi yazdirin
		// 9 dan kücükesit ve sifirdan büyük esitse ekrana rakam yazdirin.
        // Bu sayi negatif ise ekrana Sayi yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Tamsayi giriniz");
		
		int num = scan.nextInt();
		
		if(num>=0){                       // Outer if
			if(num>9){                    // Inner if
				System.out.println("Sayi");
				
			}
			     else if(num<=9 && num>=0){
				   System.out.println("Rakam");
			}
			
		}
		else if(num<0){
			System.out.println("Sayi");
		}
		
		
		scan.close();//Scanner class ini kullandiktan sonra en alta main metodunun icinde Scanner class ini kapatiniz. Bunun icin scan.close yazilir.
		
	}

}
