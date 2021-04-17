package lambdason;

import java.util.ArrayList;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		//Collectionlarda kullanilir onun icin bir tane list olusturalim
		//Lambda=Functional Programming    Hazir methodlari kullanir.Method tanimak önemlidir
		//Normal Java=Structured Programming    sen yapilandiriyorsun
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Kemal");
		list.add("Mucella");
		list.add("Ayse");
		list.add("Emine");
		System.out.println(list);
		
		//Listin tüm elemanlarini ekrana yazdiriniz
		//1.yol :Structured Programming
		for(String w: list) {
			System.out.println(w+" ");
			
		}
		System.out.println("=================");
		//2.Yol Lambda
		//t==>w gibi listin icindeki elemanlar
		list.
		   stream().
		   forEach(t->System.out.print(t+" "));
		     //t->System.out.print(t+" ")==>Lambda Expression(ifade)

		System.out.println("");
		//listin icindeki harf sayisi 5 ten az olanlari yazdirin
		for(String w:list) {
			if(w.length()<5) {
				System.out.print(w+" ");
			}
		}
		System.out.println("\n=====");
		//2.yol
		//stream yukardan asagi dizer ve elemanlari diger methodlarin kullanimina hazirlar
		list.
		    stream().
		    filter(t->t.length()<5).
		    forEach(t->System.out.print(t+" "));
		
		System.out.println("\n=====");
		//Son harfi e olanlari yazdiriniz
		list.
		   stream().
		     filter(t->t.endsWith("e")).
		       forEach(t->System.out.print(t+" "));
		
		System.out.println("\n=====");
		//a harfi icerenleri yazdiriniz
		list.stream().
		    filter(t->t.contains("a")). 
		       forEach(t->System.out.print(t+" "));
		//stram,filter,foreach ögrendik
		System.out.println("\n=====");
		//karakter sayisi 4 den fazla olanlari uppercase yaparak yazdirin
		list.
		   stream().//Elemanlari yukaridan asagiya dizer
		      filter(t->t.length()>4).//Eleman secmemize yarar
		              map(t->t.toUpperCase()).   //Karakterleri degistirmek icin update icin map
		                 forEach(t->System.out.print(t+" "));//her elemani birer birer alir
		
		
		System.out.println("\n=====");
		//listin icindeki elemanlarin eleman sayilarini ekrana yazdirin
		
		list.
		   stream().
		      map(t->t.length()).
		        forEach(t->System.out.print(t+" "));
		
		System.out.println("\n=====");
		//listin icindeki elemanlardan icinde e olanlarin eleman sayilarinin karesini yaz
		list.
		     stream().
	         filter(t->t.contains("e")). 
	         map(t->t.length()*t.length()).
	         forEach(t->System.out.print(t+" "));
		
		
	}

}
