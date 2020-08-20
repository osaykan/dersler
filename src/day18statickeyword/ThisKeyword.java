package day18statickeyword;

public class ThisKeyword {

	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){                        //Bu bir parametreli constructor 
		//this kullandigim zaman icinde bulundugum class taki instance veya static variable'lara ulasmak istiyorum demektir.
		//this istedigimiz kadar yazilabilir
		
		//this() icinde bulundugunuz classtaki parametresiz constructoru cagirmak icin kullanilir.
		//this("Ali") icinde bulundugunuz classtaki parametreli constructoru cagirmak icin kullanilir.
		//this() kullanilacaksa mutlaka ilk satira yazilmalidir. Aksi taktirde Compile Time Error verir.Bir methodta yalniz 1 kere yazilir.
		
		this("Ali");
	    
		this.x = x;  //sagdaki x constructorun icindeki int x oluyor. Buraya 15 yazinca en üstteki x in degerini 15 yapiyor.12 yi degistirmek icin kullaniyoruz.
		System.out.println("Parametreli constructor");
	}
	
	ThisKeyword(){
		System.out.println("Parametresiz constructor");
	}
	ThisKeyword(String str){
		System.out.println("String parametreli constructor");
	}
	
	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(15);    //String parametreli constructor ve altina
		System.out.println(obj1.x);//15            //Parametreli constructor
		

              //Neden önce String olani int den önce yazdi.new ThisKeyword(15) parametreli ve int deger var
		     //Bu nedenle direk new ThisKeyword(int x) constructoruna gider ve onun icinde this("Ali") karsilar, o da string oldugu icin
		     //new ThisKeyword(String str) ye gönderir.Ilkönce bunu yazar.Sonra x e atama yapar ve altindaki 	System.out.println("Parametreli constructor");
		     //satirini calistirir.
	}

}
