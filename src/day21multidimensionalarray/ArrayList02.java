package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun isim list01 ve elemanlar integer olsun
		//Listler data type olarak primitive leri kabul etmezler. int yerine Integer yaz
		//Primitivlerde data type'ini non-primitive yapmak icin wrapper class lari kullaniriz
		
		List<Integer> list01 = new ArrayList<>();
		
		
		//Bu listin icinde eleman olup olmadigini kontrol edin.  isEmpty() methodu kullanilacak
		//isEmpty() methodu list bos ise true,dolu ise false return eder
		System.out.println(list01.isEmpty());//true
		
		//Bu liste bir eleman ekleyin
		
		list01.add(123);
		System.out.println(list01);
		System.out.println(list01.isEmpty());
		
		//List'ten eleman silmek icin remove() methodu kullanilir.
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		
		list01.remove(1);//indexi 1 olanelemani siler
		System.out.println(list01);//[123, 125, 124]
		list01.remove(0);       //index i 0 olan elemani siler.
		System.out.println(list01);   //[125, 124]
		
		//Listteki son elemani silin
		
		list01.remove(list01.size()-1);
		System.out.println(list01);//125
		
		
		
		
		
		
		
		

	}

}
