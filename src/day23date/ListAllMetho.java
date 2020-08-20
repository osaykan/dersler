package day23date;

import java.util.ArrayList;
import java.util.List;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class ListAllMetho {

	public static void main(String[] args) {
		// addAll() methodu iki listi birlestirmek icin kullanilir.
		// index kullanmadan addAll kullanirsak ya bas tarafa ya son tarafa ekleme yapariz
		// Fakat index kullanarak addAll() yaparsak listi istediginiz yere eklersiniz.
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(12);
		System.out.println(list1);//[11, 12]
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
       System.out.println(list2);   // [13, 14, 15] Bu iki methodu birlestirelim
       
       list1.addAll(list2);
       System.out.println(list1);  //[11, 12, 13, 14, 15]
       
       list2.addAll(list1);
       System.out.println(list2);  //[13, 14, 15, 11, 12, 13, 14, 15]
       
       List<Integer> list3 = new ArrayList<>();
       list3.add(1);
       System.out.println(list3);   //[1]
    	   
       List<Integer> list4 = new ArrayList<>();
       list4.add(2);
       list4.add(3);
       System.out.println(list4);   //[2, 3]
       
       list4.addAll(1, list3);      //[2,1,3] araya yerlestirmek istiyoruz
       System.out.println(list4);
       
       
       
       
       List<String> str = new ArrayList<>();
       str.add("Ali");
       str.add("Veli");
       str.add("K");
       System.out.println(str);
       
     List<String> str1 = new ArrayList<>();
       str1.add("Ayse");
       str1.add("Nur");
       System.out.println(str1);
       str.addAll(str1);
       System.out.println(str);
       
       str1.addAll(1, str);
       System.out.println(str1);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
