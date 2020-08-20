package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs : Variable Arguments
		// Bir method olusturdugumuzda argument olarak istedigimiz kadar
		// argument girebilmemizi saglar.
		// Önu acik bir array demektir.
		// Method olustururken parametre sayisi degistikce yeni method olusturmaliydik
		// Ama Varargs ta buna gerek yok int veya double den sonra ücnokta yaz

		countNum(5); // 1
		countNum(5, 7, 9);// 3
		countNum(5, 7, 9, 1, 2, 3, 8, 4); // 8

		sumNums(2, 3); // 5
		sumNums(2, 3, 4, 5); // 14
		sumNums(2, 3, 4, 5, 6, 7, 8, 9.5);

		printName("Ali");
		printName("Ali", "Kahraman");
		printName("Ali", "Can", "Kahraman");
	}

	public static void countNum(int... a) {
		System.out.println(a.length);

	}

	public static void sumNums(double... b) {
		double sum = 0;
		for (double w : b) {
			sum = sum + w;
		}
		System.out.println(sum);

	}

	public static void printName(String... n) {

		for (String w : n) {
			System.out.print(w + " ");

		}

	}

}
