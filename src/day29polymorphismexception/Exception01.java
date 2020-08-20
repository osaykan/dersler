package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		//Exception: Istisnai hata
		//Temelde kac tür exception var
		//Temelde 2 tür exception var; 1) Compile Time exception(Checked)
		//                              2) Run Time Exception
		//Compile Time Exception a ornek verebilirmisin
		//1)FileNotFoundException ==> Dosya Bulunamadi
		//2)IOException(InputOutput Exception) Input veya Output yapilirken olusan problemlerde ortaya cikar.
		//Not: FileNotFoundException ,IOException un childi dir
		//Not: Compile Time Exception mutlaka handle edilmelidir

		//Check Exceptionlar iki turlu handle edilir
		//  1) Method isminden sonra "throws" keyword kullanilir
		//  2) try-catch block kullanilir.Bu daha iyidir.Cunku readable dir.
	}

}
