package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map(interface) childleri asagidakiler
		//HashMap(class)
		//HashTable(Class)
		//TreeMap(Class)
		
		//Map bir interfacedir. Map interface'nin 3 tane child Classi vardir
		/*1)HashMap: HashMap key-value yapisini kullanir. Key ve Value programci tarafindan yazilir.
		 *          Key ve value da null degeri kullanilabilir. Key'de 1'den fazla nul degeri kullanilirsa Java son 
		 *          kullanilan null'u kabul eder. Value da 1 den fazla null degeri kullanilabilir.
		 *          HashMap console'a yazdirildiginda hem key degeri hemde value degerleri 
		 *          aralarina = sembolu konularak yazdirilir.
		 *          HashMap ler ekrana yazdirirken rastgele siralama yapar.
		 *          HashMap mapler arasinda en hizlisidir.
		 *          HashMap'ler "thread safe" degildir.Ayni anda sadece bir yerde calisir.
		 * 
		 * 
		 */
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(333,"Ali");
		hashMap.put(123,"Veli");
		hashMap.put(211,"Mine");
		hashMap.put(443,"Kemal");
		
		System.out.println(hashMap);    //{211=Mine, 123=Veli, 443=Kemal, 333=Ali}
		
		System.out.println(hashMap.remove(443));  //Kemal
		System.out.println(hashMap);   //{211=Mine, 123=Veli, 333=Ali}
		
		System.out.println(hashMap.remove(123,"Veli"));   //true
		System.out.println(hashMap.remove(211,"Ayse"));  //false
		System.out.println(hashMap);                  //{211=Mine, 333=Ali}
		
		System.out.println(hashMap.get(211));         //Mine  211 getirdi
		System.out.println(hashMap.get(100));        //null
		
		System.out.println(hashMap.keySet());      //[211, 333]
		System.out.println(hashMap.values());      //[Mine, Ali]
		
		System.out.println(hashMap.size());      //2   eleman sayisi
		

		System.out.println(hashMap.containsKey(333));  //true
		System.out.println(hashMap.containsKey(123));  //false
		
		System.out.println(hashMap.containsValue("Mine"));  //true
		System.out.println(hashMap.containsValue("Emin"));  //false
		
		hashMap.replace(211,"Emin");
		System.out.println(hashMap);  //{211=Emin, 333=Ali}
		
		hashMap.clear(); //   tüm elemanlari siler
		System.out.println(hashMap);     //{}

		
		
		
		
		

	}

}
