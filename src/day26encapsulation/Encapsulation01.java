package day26encapsulation;

public class Encapsulation01 {

	private String kimlikNo = "34212367512";
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encapsulation data saklama (data-hiding) yöntemidir.
		// Encapsulation iki stepte yapilir
		// 1) Data'yi (variable , method) private yapmalisiniz.
		// 2) public olan getter() ve setter() methodlar üretmeliyim
		// getter() data'yi sadece okumamiza yarar, data'da degisiklik yapamaz
		// setter() data'yi degistirmemize yarar.

	}

	// getter() üretmek icin; 1) Access Modifier public olmali
	// 2) Return type variable'in return type' ile ayni olmali
	// 3) Method ismi "get+variable ismi" seklinde olmali
	public String getKimlikNo() {
		return kimlikNo;
	}

	public int getKrediKartNo() {
		return krediKartNo;
	}

	// return type boolean ise method ismi "is" ile baslar. get kullanilmaz.

	public boolean isSoguk() {
		return soguk;
	}

	// setter() üretmek icin ; 1) Acces Modifier public olmali
	// 2) Return type void olmali
	// 3) Method ismi "set + variable ismi" seklinde olmali
	// 4) Parametre kullanilmali(%99)
	// 5) setter() methodlarinin ismi booleanlar icinde set ile baslar
	public void setKimlikNo(String kimlikNo) { // daima void olmali ve () icine
												// yazilmali
		this.kimlikNo = kimlikNo; // sag taraftaki parantez icine yazilandir
									// bazen farkli olabilir

	}

	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}

	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}

}
