package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan Stringi degistirmez

		StringBuilder str1 = new StringBuilder("animals"); // Obje olusturuyoruz
		// str1=str1.substring(3); // hata verir , cünku substring() methodu String
		// Class'indan gelir ve bir String return eder.
		// Halbuki str1 String degil StringBuilder dir.
		// Java data type leri farkli oldugundan atamayi kabul etmez.
		// Bu hatadan kurtulmak icin iki yol var
		// 1:Yol: String Class' indan yeni bir String üretip atama yapilir
		String str2 = str1.substring(3);
		System.out.println(str2); // mals

		// 2.Yol: str1.substring(3); ifadesini direk syso nun icine yazin
		System.out.println(str1.substring(3));

		System.out.println(str1.substring(1, 4));// nim

		// indexOf() methodu belli bir characterin indexini return eder
		System.out.println(str1.indexOf("m")); // 3 aliriz

		// length() methodu String classindan gelir ve Stringin uzunlugunu return eder.
		System.out.println(str1.length()); // 7

		// charAt() belli bir index teki characteri return eder

		System.out.println(str1.charAt(5));// animals da indexi 5 olan l yi return eder

		// insert() methodu istenen indexse istenen characteri eklemeye yarar.
		// insert() methodu append() gibi StringBuilder'i direkt degistirir.
		str1.insert(0, "X"); // syso nun icine koymaya gerek yok
		System.out.println(str1);// Xanimals

		// delete() istenen index araligindaki characteri siler
		str1.delete(0, 1); // StringBuilder den geliyor atamaya veya sys nin icine yazmaya gerek yok
		System.out.println(str1);// animals

		// deleteCharAt() istenen index teki characteri siler
		str1.deleteCharAt(6);// s harfini siler
		System.out.println(str1);

		// reverse() methodu Stringi tersten yazdirir.
		str1.reverse();
		System.out.println(str1);// lamina

		// toString() methodu StringBuilder'i Stringe cevirmek icin kullanilir
		str1.toString();
		System.out.println(str1);// Artik str1 Stringdir

		// StringBuilder Java nin 5.versiyonunda olusturuldu. StringBuffer ler
		// StringBuilder larin eski versiyonudur.
		// StringBuilder ler daha hizli calisir.Bu yüzden StringBuilder kullanmayi
		// tercih ederiz.

	}

}
