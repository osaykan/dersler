package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//Bir arrayin icinde belli bir elemanin olup olmadigini kontrol edelim
		//binarySearch() methodu bu is icin kullanilir
		//binarySearch() methodu aranan eleman var oldugunda o elemanin indexini return eder
		//Ayni elemanlar oldugunda ilkinin indexini verir
		//Önemli Not: binarySearch() methodunu kullanmadan once sort() methodunu kullanmak zorundayiz.
		
		int arr[] = {1,7,2,4,3};
		
		//Yukarida verilen array de 3 eleman olarak varmi?
		
		Arrays.sort(arr);
		Arrays.binarySearch(arr, 3);//2 index numarasini verir.
        System.out.println(Arrays.binarySearch(arr, 3));
        
        //olmayan elemanlar icin negatif sayilar return eder.{1,2,3,4,6,7} 6 olsaydi 5 inci eleman olacakti ,olmadigi icin -5 i return eder
        // eleman varsa index no yu, yoksa sira numarasini verir
        System.out.println(Arrays.binarySearch(arr, 6));
	}

}
