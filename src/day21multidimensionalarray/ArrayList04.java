package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		//["A","C","B","C"] listini olusturun
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");

		System.out.println(list);   //[A, C, B, C]
		
		
		//Listte eleman olarak B varmi
		
	//	list.contains("B");  // list B yi iceriyormu. Eger varsa true yoksa false return eder
		System.out.println(list.contains("B"));  //true
		
		//Listte eleman olarak Z varmi
		System.out.println(list.contains("Z"));  //false
		
		
		//Listteki elemanlari alfabetik siraya koyun
	   //Collections==> bir araya getirilmis parcalar
		//Bir listteki elemanlari alfabetik siraya dizmek(Natural Order) icin
		//Collections.sort(); methodu kullanilir. Argument olarak list'in adi yazilir 
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
	}

}
