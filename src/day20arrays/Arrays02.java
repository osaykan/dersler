package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//Bir integer array'in elemanlarini k�c�kten b�y�ge diziniz ve ekrana iki durumuda yazdirin.
		
		
		int arr[] ={2,11,0,23,7};
		System.out.println("�nce" +Arrays.toString(arr));
		
		//Arrays.sort();  methoduna arrayin ismi yazilirsa o arrayin elemanlari k�c�kten b�y�ge siralanir(Ascending order veya natural order)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//Charlardan olusan bir Array olusturunuz ve Ascending order yapiniz
		//Charlar siralanirken Java ASCII kodlari kullanir.B�y�k harflerin ASCII kodlari k�c�k harflerden azdir.
		//Java rakamlarin ASCII kodunu o rakamin degeri gibi d�s�n�r
		char arrCh[] = {'b','d','a','c','C','1'};    //ascii koda g�re siralar
		System.out.println(Arrays.toString(arrCh));
		Arrays.sort(arrCh);
		System.out.println(Arrays.toString(arrCh));
		
		//Soru: Stringlerden olusan bir array olusturun ve ascending ordner yapin
		
		String arrStr[] = {"Ankara","Istanbul","Bursa","65","Kocaeli","Adana","Balikesir","ankara"};
		System.out.println("�nce "+Arrays.toString(arrStr));
		Arrays.sort(arrStr);
		System.out.println("Sonra "+Arrays.toString(arrStr));
		
		
		//Boolean bir array olusturun ve ascending order yapin.Boolean lar icin sort methodu kullanilmaz
		
//		boolean arrBl[] = {true,false,false};
//		System.out.println("�nce "+Arrays.toString(arrBl));
//		
//		Arrays.sort.(arrBl);
//		
		
		
		
		
		
		
		
	}

}
