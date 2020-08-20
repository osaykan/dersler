package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1 = 101;
		int sayi1 = by1; //Kücük data tipini buyuk data tipine cevirmek icin ekstra kod yazmaya gerek yok. Java bunu otomatik yapar.(Auto Widening)
		System.out.println(sayi1);
	

		
		int sayi2 = 53;
		//byte by2 = sayi2; bu sekilde kabul etmiyor büyükten kücüge hemen gecmiyor.Sag tarafta Önüne (byte)
		byte by2 = (byte)sayi2;
		System.out.println(by2);
		
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(by3);
		
		
		float sayi4 = -23.9f;
		short by4 =(short)sayi4;
		System.out.println(by4);
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5/sayi6;
		System.out.println(sonuc1);//Sonuc 3.428571428571429
		
		int sonuc2 = (int)(sayi5/sayi6); // önüne (int) yazmayinca sikayet ediyor
		System.out.println(sonuc2);
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7/sayi8;
		System.out.println(sonuc3);
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;// kirmizi cizginin ustune gidip add typ to byte tiklayinca (byte) geliyor.
		System.out.println(by5);// 255 cikmasini bekliyoruz ama 255 sinirlarin disinda.
		                        // -1 cikti. Normalde byte ta(-128,-127,...0,1....127) 256 sayi var. 255 i 256 ya bölüyor kalan -1....Mod256 ya göre islem yapiyor.
		
		
		
		
		
		
		
		
		
	}

}
