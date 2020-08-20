package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
	                    	// startsWith() methodu bir Stringin istenen harfle baslayip baslamadigini kontrol eder.
		//Istenen harfle basliyorsa true yoksa false return eder.
		
		String str1 = "Ali Can";
		//startsWith() 1. versiyon
		
		System.out.println(str1.startsWith("A"));//true
		System.out.println(str1.startsWith("B"));//false
		System.out.println(str1.startsWith("a"));// false
		
		System.out.println(str1.startsWith("Ali")); //true
		
		
		//startsWith() 2. versiyon
		
		System.out.println(str1.startsWith("a", 3));  // index 3 den itibaren a ile basliyormu  false
		System.out.println(str1.startsWith("a", 5));  //true
		System.out.println(str1.startsWith("Can", 4));//true
		
		
		
		            // endsWith() methodu bir Stringin istenen harfle bitip bitmedigini kontrol eder.
		         //Istenen harfle bitiyorsa true yoksa false return eder.
		
		
		String str2 = "Ayse Canan";
		
		System.out.println(str2.endsWith("n"));//true
		System.out.println(str2.endsWith("Canan"));//true
		System.out.println(str2.endsWith("CANAN"));//false

		System.out.println(str2.endsWith(""));// ""  ve  " " tamamiyla farkli.Ikincinin icinde bosluk karakteri vardir.Birincide yok. true verir
		
		
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));//true
		System.out.println(str3.endsWith(""));//true
		System.out.println(str3.startsWith(""));//true
		
		
		
		
		
		
	}

}
