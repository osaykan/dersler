package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//Bir integer array'in elemanlarini kücükten büyüge diziniz ve ekrana iki durumuda yazdirin.
		
		
		int arr[] ={2,11,0,23,7};
		System.out.println("Önce" +Arrays.toString(arr));
		
		//Arrays.sort();  methoduna arrayin ismi yazilirsa o arrayin elemanlari kücükten büyüge siralanir(Ascending order veya natural order)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//Charlardan olusan bir Array olusturunuz ve Ascending order yapiniz
		//Charlar siralanirken Java ASCII kodlari kullanir.Büyük harflerin ASCII kodlari kücük harflerden azdir.
		//Java rakamlarin ASCII kodunu o rakamin degeri gibi düsünür
		char arrCh[] = {'b','d','a','c','C','1'};    //ascii koda göre siralar
		System.out.println(Arrays.toString(arrCh));
		Arrays.sort(arrCh);
		System.out.println(Arrays.toString(arrCh));
		
		//Soru: Stringlerden olusan bir array olusturun ve ascending ordner yapin
		
		String arrStr[] = {"Ankara","Istanbul","Bursa","65","Kocaeli","Adana","Balikesir","ankara"};
		System.out.println("Önce "+Arrays.toString(arrStr));
		Arrays.sort(arrStr);
		System.out.println("Sonra "+Arrays.toString(arrStr));
		
		
		//Boolean bir array olusturun ve ascending order yapin.Boolean lar icin sort methodu kullanilmaz
		
//		boolean arrBl[] = {true,false,false};
//		System.out.println("Önce "+Arrays.toString(arrBl));
//		
//		Arrays.sort.(arrBl);
//		
		
		
		
		
		
		
		
	}

}
