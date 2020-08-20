package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		//HashSet (bir class)  1)Tekrarli eleman(Value) kullanimina (dublication) izin vermez
		//         2)Key-Value yapisini kullanir. Key'ler ve Value'lar HashSet icin unique'dir(essiz has==>münhasir)
		//         Normalde; Key ler her zaman unique'dir, Value'lar kullanilan class'a bagli olarak unique olabilir
		//        veya olmayabilir. Kullanilan class HashSet ise Value'lar da unique olur ama ArrayList ise 
		//         unique olma zorunlulugu yoktur.

		HashSet<String> hSet = new HashSet<>();   //new HashSet==> constructor
		hSet.add("Apple");                  //Listlerde add() methodu yeni elemani hep sona ekler ama HashSet'lerde
		hSet.add("Mango");                  //oyle bir zorunluluk yok,rastgele yazdirir.
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Aple");                 //Ayni eleman HashSet' eklenmek istendiginde CTE veya RTE alinmaz.
		                                  //Son eklenen eleman ilk elemanin üstüne yazilir.
		System.out.println(hSet);  //[Apple, Fig, Grape, Mango, Orange]
	
		
	}

}
