package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		//1)Baska bir Classtan �rettigimiz object'i yeni �rettigimiz class ta kullanabiliriz
		//2)Object in �zelliklerini degistirebiliriz, fakat  bu degisim sadece o object ile
		//   sinirli kalir. Yeni �retilecek olan object ler bu degisimlerden etkilenmez.
		//3) Eger �retilecek her object in degisime ugramis olmasini istiyorsaniz class daki �zellikleri
		// degistirmelisiniz.
		
		Constructor01 hondaAraba01 = new Constructor01();    //1.sayfadan aliyor
		System.out.println("Zamli Fiyat: "+(hondaAraba01.price+1000));
		System.out.println("Year: "+(hondaAraba01.year-1));
		System.out.println("Zamli Fiyat: "+hondaAraba01.make.replaceAll("Honda", "Toyota"));
		System.out.println("Zamli Fiyat: "+hondaAraba01.type.replaceAll("Civic", "Camry"));
		
		
		Constructor01 hondaAraba02 = new Constructor01();
		System.out.println("Zamli Fiyat: "+(hondaAraba02.price+3000));//Ilk fiyatin �zerine ekler
		
	}

}
