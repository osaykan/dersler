package day17constructors;

public class Constructors02 {
// Büyüme methodu bu classta degil.Contructors01 de. Bu yüzden müsade etmiyor
	//Eger baska bir classtaki methodu kullanmak istiyorsak o classtan bir obje olusturup
	//o object sayesinde istedigimiz methodu kullanabiliriz.
	public static void main(String[] args) {
		
		//buyume(33);    calismaz.Önce obje olustur sonra kullan.
		 Constructors01 obj1 = new Constructors01();
		 obj1.buyume(33);//büyüme methodu static oldugundan Java object kullanarak buyume methodunu  cagirmamizi istemez bu yüzden sari var
		 Constructors01.buyume(57);//58  obje olusturmadan aldik.Method static.
		 obj1.isimDegistir("Kemal Can");
		 Constructors01.isimDegistir("Merhaba Numan");
		 System.out.println(obj1.isim);
		 System.out.println(obj1.yas);
		 
		  // 03 deki variableler static oldugundan obje olusturmadan classin ismini yazip nokta ile ulasabiliriz.
		                                        //obje kullanmaya gerek sok
		 System.out.println(Constructors03.ad);
		 System.out.println(Constructors03.kilo);
		 Constructors03.artirma(45);//46
		 Constructors03.degistirme("Ayhan Isik");;
	}

}
