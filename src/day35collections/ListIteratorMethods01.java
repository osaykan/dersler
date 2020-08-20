package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		//Elemanlari A,B ve C stringleri olan bir list olusturun
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);//[A, B, C]
		
		//list iterator olusturunuz ve list elemanlarini yazdiriniz.
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){           //hasNext  önünde varmi varsa true
			Object element=listIterator.next();  //Hz Adem herseyi alir.String te olsa olurdu  
			                                     //next==> i++ gibi
			System.out.print(element+" ");   //A B C 
			
		}
                                                      //Bir list i tersten yazdirmak icin önce hasNexti kullanmaliyiz
		System.out.println();
		
		while(listIterator.hasPrevious()){                           //hasPrevious==> bir öncesine bak demek
		Object element=	listIterator.previous();                     //previous()==> i-- gibi
		System.out.print(element+" ");        //C B A                         
			
			
		}
	}

}
