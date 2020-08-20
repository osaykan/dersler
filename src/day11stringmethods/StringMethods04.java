package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		// valueOf() methodu rakamlarla olusturulan Stringleri sayiya dönüstürür. Böylece rakamlarla olusturulan Stringlerle matematiksel islemler yapmamizi saglar.
		// ValueOf() hem Integer wrapper classinin icinde var hemde Stringin icinde ver.
		//Integer wrapper  clasinin icindeki valueOf() methadu Stringi int e cevirir. Stringin icindeki valueOf inti Stringe cevirir
		
		String paraErkek = "1900";
		String paraKadin = "2000";

		//Bu ailenin toplam gelirini bulalim.
		
		System.out.println(Integer.valueOf(paraErkek)+ Integer.valueOf(paraKadin));//3900
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		
		//maasErkek ve maasKadin sayilarini Stringe dönüstürün ve concatenation yapin
		System.out.println(String.valueOf(maasErkek)+ String.valueOf(maasKadin));//19002000
		
		
		
		
	}

}
