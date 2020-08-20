package day10stringmethods;

public class StringMethod01 {
     
	public static void main(String[] args) {
		// indexOf() methodu Stringin icindeki characterin yerini belirlemek icin kullanilir.
		
		String str1 = "Javva World"; // v nin yerini belirlemek istiyoruz.
		
	      System.out.println(str1.indexOf('v'));  // Ekrana 2 yazdirir cünkü index sayimi 0 dan baslar
	      System.out.println(str1.indexOf('W'));  //Ekrana 6 yazdirir. space (bosluk) bir character
	      System.out.println(str1.indexOf('w')); // Java index bulamaz cuhku Java "case sensitive" dir.
	                                             // Kücük w Stringte yok. Bulamayinca -1 return eder.

	      System.out.println(str1.indexOf('a')); //Ekrana 1 yazdirir. Birden fazla kullanilan characterler icin ilk caharacterin indexini verir
	                                             //Java soldan saga calisir.Ilk a harfini bulunca devamina bakmaz 
	      
	      
	      // indexOff() methodu 2. versiyonu
	      
	      System.out.println(str1.indexOf('a',2));  // Stringteki ikinci 'a' characterinin indexini bulunuz.
	                                                //Ekrana 4 yazrirmali. a nin indexi 1. a dan sonraki indexs 2. Bunun icin 2 yazilir. Ilk v den itibaren
	      
	      System.out.println(str1.indexOf('a',4));  
	      System.out.println(str1.indexOf('a',2));
	      System.out.println(str1.indexOf('a',5));  // -1 yazdirir. 5 ten itibaren a yok
	      
	      //Alamanya Stringindeki ikinci 'a' characterinin indexini bulunuz.
	      
	      String str2 = "Alamanya";
//	      System.out.println(str2.indexOf('a')); // bu birinci 'a'===> 2 ........birinciyi bulmadanda idx tanimlayarak devam edilebilir.
	      int idx = str2.indexOf('a');
	      System.out.println(str2.indexOf('a',idx+1));
	      
	      
	      //indexOf() methodu 3. versiyonu
	      
	      String str3 = "Missisippi";      // "is" kalibini bulalim 
	      
	      System.out.println(str3.indexOf("is"));  // Ilk "is" Stringini bulur ve ilk harfin indexini return eder. Bu örnekte ilk is teki
	                                               // i harfinin indexi olan 1 i return eder
         System.out.println(str3.indexOf("si"));  //  Ekrana 3 yazdirir 
	 
	 
	 
	 
	 
	 
	      
	      
	      
	      
	      
	}

}
