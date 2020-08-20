package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
	//Elemanlari A,B ve C olan bir list olusturunuz. List iterator kullanarak bu elemanlari
		//AW,BW ve CW ye dönüstürünüz
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);//[A, B, C]
		
		ListIterator<String> listiterator =list.listIterator(); 
       while(listiterator.hasNext()){
    	   Object element=listiterator.next();
    	   System.out.print(element+"W ");  //AW BW CW   elementi yazdirsaydik burada olmaliydi
    	   listiterator.set(element+"W");     //Bu atama en bastaki listi degistirir.
       }
       System.out.println();
       System.out.println(list);  //[AW, BW, CW]   burada listi yazdirdik
       listiterator.add("Kemal");
       listiterator.add("Can");
       System.out.println(list);   //[AW, BW, CW, Kemal, Can]
	}

}
