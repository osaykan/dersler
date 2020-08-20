package day16overloading;

public class Overloading02 {

	public static void main(String[] args) {
		 
	}
	// Note 1: Return type'i (int,void..)degistirmek overloading icin yeterli degildir.
	// Java methodlarin farkli olup olmadiklarini anlamak icin iki seye bakar.
	//      a)Method ismine  b) Parametrelere bakar
	// Method ismi ve parametreler Java icin methodlarin imzasi gibidir.(carpma ve int num1,int num2...)
	//Javada method imzasi yerine "method signature" denir
	//Note 2: Access Modifier'lari degistirmek de methodlari Java acisindan farkli hale getirmez.
	//        Cünkü access modifierlar method signature dahil degildir.(public veya private...)
	//Note 3: Method larin body sini degistirmek de methodlari Java acisindan farkli hale getirmez.
	 //       Cünkü body ler method signature a dahil degildir  { icindekilerin farkli olmasi  }
	//Note 4: Siz daha kodu yazarken yani calistirmadan önce Java sizi yaptuginiz hatalardan dolayi uyarirsa
	//         bu tip hatalara "COMPILE TIME Error" denir(Compile==> derleme)
	//Note 5: Kodu yazarken herhangi bir hata yok.Fakat calistirdiktan sonra console'da kirmizi hata mesajlari alirsaniz
	//        Bu hatalara "RUN TIME Error" denir.
	//Note 6: Overloading Compile Time Error verir.
	
//	public static void carpma(int num1, int num2) {
//		
//		System.out.println(num1*num2);
//	}
//	public static int carpma(int num1, int num2) {
//		
//		return num1*num2;
//	}
//	private static int carpma(int num1, int num2) {
//		
//		return num1*num2;
//	}
}
