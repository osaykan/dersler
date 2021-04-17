package lambdason;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
		//List elemanlarindan tekrarli olanlari 1 kere yazdirmak sartiyla alfabetik sirayla yazdir
		
		list.
		   stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("============");
		//List elemanlarindan tekrarli olanlari 1 kere yazdirmak sartiyla ekrana elemanlari
		//uzunluklarina göre sirayla yazdir
		list.stream().distinct().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
		
		
		System.out.println("============");
		//List elemanlarindan tekrarli olanlari 1 kere yazdirmak sartiyla ekrana elemanlari
				//son harflerine  göre sirayla yazdir
		list.
		  stream().
		  distinct().
		  sorted(Comparator.comparing(t->t.substring(t.length()-1))).
		  forEach(System.out::println);
		
		
		System.out.println("============");
		//List elemanlarindan tekrarli olanlari 1 kere yazdirmak sartiyla alfabetik siraya göre tersten yazdir
		
		list.stream().distinct().sorted(Comparator.reverseOrder()). forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
