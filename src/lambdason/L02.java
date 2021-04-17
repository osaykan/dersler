package lambdason;

import java.util.ArrayList;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		System.out.println(list);
		System.out.println("\n ========    ");
		
		//Tün cift sayi olan elemanlarin küplerini yazin
		list.
		  stream().
		  filter(t->t%2==0).
		    map(t->t*t*t).
		    forEach(t->System.out.print(t+" "));

		System.out.println("\n ========    ");
		//Tüm elemanlariun toplami
		System.out.println(list.
				           stream().
				           reduce(0,(t,u)->t+u ));//azaltma demek sum=0 icin 0 yazildi
						//t=0 ve u ilk deger 12 demek 0+12=12 sonra t=12 oluyor
						//t=12 ve u ikinci deger 9    12+9=21        t=21
		      //bir cok sayiyi bir sayiya cevirdi onun icin reduce kullanilir
		
	
		System.out.println("\n ========    ");
		//Tüm tek sayi olan elemanlariun carpimini  product=1  sum=0 gibi düsünmeli
		int result=     list.
				           stream().
				           filter(t->t%2==1).
				           reduce(1,(t,u)->t*u );
		System.out.println(result);

		System.out.println("\n ========    ");
		//3 ile bölünebilen elemanlarin iki fazlalarinin toplamini bul
		int result1=     list.
		           stream().
		           filter(t->t%3==0).
		           map(t->t+2).
		           reduce(0,(t,u)->t+u );		
				System.out.println(result1);
				
				System.out.println("\n ========    ");
				//elemanlari tekrarsiz olarakyazdirin
		list.
		 stream().
		 distinct().
		 forEach(t->System.out.print(t+" "));//==>Lambda Expression
		//Lambda Expression kullanilabilir ama daha güzeli mumkünse "Method Reference" kullanin
	  //Method Reference==>Class Ismi :: Method Ismi
	  //forEach(System.out::print);  araya bosluk konamiyor
	
		System.out.println("");
		list.
		 stream().
		 distinct().
		 forEach(System.out::print);
		

		System.out.println("\n ========    ");
		//3 ile bölünebilen elemanlarin iki fazlalarinin toplamini bul
		int result2=list.
		             stream().
		             filter(L02::bölünebilme).//methoddan cagirdik  filter(t->t%3==0).
		              map(t->t+2).
		             reduce(0,(t,u)->t+u );		
				System.out.println(result2);
				
	
	}

	private static boolean bölünebilme(int t) {
		return t%3==0;
	}
	
}
