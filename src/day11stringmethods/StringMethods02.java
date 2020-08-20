package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring() methodu bir Stringin belli bir bölümünü kesip almak icin kullanilir.
		
		String str1 = "Java calisana kolaydir";
		
		           // substring() 1. versiyon
		
		System.out.println(str1.substring(5));// 5.indexten itibaren sonraki hepsini gösterir...calisana kolaydir
		System.out.println(str1.substring(8));//8.indexten itibaren sonraki hepsini gösterir...isana kolaydir
		System.out.println(str1.substring(22));// 22.index yok .Birsey vermiyor.
	//	System.out.println(str1.substring(23));// 23.index yok olmayan yerden kesmek istiyoruz. Bu bir hatali istektir.Exception verir
		System.out.println(str1.substring(0));
		
		        //substring() 2. versiyon
		
		System.out.println(str1.substring(5, 13));//5.index ten baslar 12. index dahil aradakilerini alir...calisana
		System.out.println(str1.substring(6, 12));// [5,12)   alisan
		System.out.println(str1.substring(6, 6));// son sözü ikinci 6 söyler . Digerini iptal eder. Birsey vermez.
	//	System.out.println(str1.substring(7, 6));  // Exception verir.
		
		
		
		
		
	}

}
