package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exception02 {
	
	//Checked Exceptionlari(Compile Time Exception) handle etmek icin iki yol var;
	// birincisi "throws" keywordunu kullanmak. Bunu kullanirsaniz consolda teknik mesajlar görürsünüz
	//Bu yüzden cok tercih edilmez

	public static void main(String[] args) throws FileNotFoundException{
		
		FileInputStream file = new FileInputStream("C/ogrenci.txt"); 

	}
}

   //Ikincisi try-catch block kullanmaktir. Bunu kullanirsaniz consolda teknik mesajlar 
// yerine kendi yazacaginiz mesajlari görebilirsiniz.Bu yüzden tercih edilir.
class ExceptionTryCatch{      //Once bu class i yazdirmak istersek class isminin üzerinde sag tikla run as java1 sec
	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("C/ogrenci.txt");
		} catch (FileNotFoundException e) {
		
			System.out.println("Dosyanin path'i yanlis veya dosya silinmis olabilir");
		} 

		
	}
}
