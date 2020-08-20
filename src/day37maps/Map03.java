package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/*TreeMap: 1) TreeMap key'lerde null kullanmaya müsade etmez ama value lerde istedigimiz kadar
		 *           null kullanmaya müsade eder
		 *         2) TreeMap elemanlarini consola yazdirmak istedigimizde key'ler natural order'a göre siralar
		 *         3) TreeMap en yavaslaridir
		 *           
		 * 
		 */
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("Kanaat",null);
		tMap.put("Bezelye",7);
		tMap.put("Elma",10);
		tMap.put("Armut",8);
		System.out.println(tMap);      //{Armut=8, Bezelye=7, Elma=10, Kanaat=null}

	}

}
