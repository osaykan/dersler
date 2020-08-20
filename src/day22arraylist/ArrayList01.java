package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin birbirine esit olup olmadigini kontrol eder
		//Listler esitse true degilse false return eder
		//equals() methodu ayni indexte ayni elemanin olup olmadigini kontrol eder
		//Birbirinin fotokopisi gibi olmaliki true alalim
		//referencelere bakmaz
		
		List<String> list1 = new ArrayList<>();

		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));  //true
		
		list1.add("A");
		System.out.println(list1.equals(list2));  //false
		
		list2.add("A");
		System.out.println(list1.equals(list2));  //True
		
		list1.add("B");
		list1.add("C");
		list2.add("C");
		list2.add("B");
		System.out.println(list1.equals(list2));
		
		
		
	}

}
