package day17constructors;

public class Constructors01 {
	
	String isim = "Ali Can";                //instence variable 2 tane
	int yas = 33;
// Method ile main method ayni classta ise methodun sadece ismini yazarak kullanabilirsiniz
	public static void main(String[] args) {
	buyume(33);	
	isimDegistir("Ayse Han");

	}
	public static void buyume(int yas){
		yas++;
		System.out.println(yas);
	}
	public static void isimDegistir(String isim){
		System.out.println(isim);
	}

}
