package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;

	// Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile
	// ilgili
	// setter() olusturmamalisiniz.

	// Variable'a atanan degerin okunmasini istemiyorsaniz , o variable ile
	// ilgili
	// getter() olusturmamalisiniz

	// Sadece getter kullanip hic setter kullanmazsaniz, variable degeri
	// degistirilemez demektir.
	// Bu tarz classlara "Immutable Class" denir.

	// Sadece setter kullanip hic getter kullanmazsaniz, variable degeri
	// okunamaz demektir.

	public static void main(String[] args) {

		Encapsulation01 obj = new Encapsulation01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNo("100000000");
		System.out.println(obj.getKimlikNo());

		Encapsulation02 obj1 = new Encapsulation02();
		System.out.println(obj1.emekli);
		System.out.println(obj1.ilkHarf);
		obj1.setIlkHarf('O');

	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
		System.out.println(ilkHarf);

	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
