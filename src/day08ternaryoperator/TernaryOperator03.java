package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz
		//Kücük sayiyi ekrana yazdiriniz
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
        double num1 = sc.nextDouble();

        System.out.println("Ikinci sayiyi giriniz");
        double num2 = sc.nextDouble();
        
        
     double result =   num1>=num2 ? num2 : num1;   //result sonuc demek
        System.out.println(result);
	
	sc.close();
	}

}
