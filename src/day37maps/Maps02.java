package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*HashTable: HashMap ile hemen hemen aynidir.
		 *           1)HashTable konsola yazdirildiginda HashMap gibi rastgele yazdirir.
		 *           Farklari:
		 *           1)HashTable Key ve Value lerde null'a müsade etmez
		 *           2)HashTable thread safe dir.Ayni anda birkac yerde kullanilir
		 *           3)HashTable daha yavastir
		 */

		Hashtable<String,String> hTable = new Hashtable<>();
		
		hTable.put("Dil","Kalp");
		hTable.put("Gönül","Kalp");
		hTable.put("Dil","Tad alma organi");   //Ayni key degerini kullaninca son value yi kabul eder
		
		System.out.println(hTable);           //{Dil=Tad alma organi, Gönül=Kalp}
		hTable.put("Ali","");
		System.out.println(hTable);       //{Ali=, Dil=Tad alma organi, Gönül=Kalp}
		
		//System.out.println(hTable.put(null, "Agizlik"));   lang.NullPointerException
	//	System.out.println(hTable.put("Kanaat",null));    NullPointerException
		
		//HashMap teki methodlarin tamami HashTable dede kullanilir.
		
	}

}
