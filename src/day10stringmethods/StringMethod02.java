package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiginiz karakterin String icindeki son g�r�m�n�n indexini return eder.
		
		                 // lastIndexOf() methodu 1. versiyonu
		
		String str1 = "Sivrihisar";
		
		System.out.println(str1.lastIndexOf('i'));  //Ekrana 6 yazdirir. C�nk� i characterinin String icinde son g�r�m�n�n indexi 6 dir.
		System.out.println(str1.lastIndexOf('r'));  //Ekrana 9 yazdirir
		
		
		                // lastIndexOf() methodu 2. versiyonu

		System.out.println(str1.lastIndexOf('i', 7));  // Ilk 7 indexin icinde i harfinin son g�r�n�m�n�n indexini return eder.(Sivrihis)		
		
		
		             // lastIndexOf() methodu 3. versiyonu
		
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); // Stringin icindeki ri nin son g�r�n�m�n� bulacak.
		                                            // son ri deki r nin indexi olan 9 u return eder.
		
	}

}
