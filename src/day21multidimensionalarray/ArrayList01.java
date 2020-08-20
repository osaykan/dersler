package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
	 //List denen sey esnek array demek
		//Arraylerde length sabittir degistirilemez.
		//ArrayList lerde length esnektir. Siz eleman ekledikce List length'ini artirir.
		//Eleman silindikce List length'ini artirir.
		
		//List <String> list01 = new List<>();==> olmaz
		//ArrayList <String> list01 = new List<>();   olmaz
		//ArrayList <String> list01 = new ArrayList<>();  olur ama asagidaki daha cok kullanilir
         //List <String> list01 = new ArrayList<String>();  bu da olur ama asagidaki daha cok kullanilir.
		
		List <String> list01 = new ArrayList<>(); //iki kere import util den yapiyoruz.
		System.out.println(list01);// [] verir eleman yok.Yazdirmak icin sadece List in ismini yazmak yeterli
		
		//List'e eleman eklemek icin add() methodu kullanilir
		list01.add("Ali");
		System.out.println(list01);  //[Ali]
		
		list01.add("Can");
		System.out.println(list01);  //[Ali, Can] önce ekleneni öne koyar
		
		list01.add("Veli");
		System.out.println(list01);//[Ali, Can, Veli]
		
		//Osman i Ali ili Can arasina eklemek icin
		list01.add(1, "Osman");    //[Ali, Osman, Can, Veli]
		System.out.println(list01);
		
		
		//[Han,Ali,Osman,Kemal,Can,Ayse,Veli] haline getirin
		list01.add(0,"Han");
	
    	list01.add(3,"Kemal");
//		

     	list01.add(5,"Ayse");

		System.out.println(list01);
		//list01 in eleman sayisini ekrana yaz. size() methodu kullanilir
		
		System.out.println("Eleman sayisi: "+list01.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
