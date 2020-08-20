package day33interface;

public class LüksHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		
		LüksHonda lüksHonda = new LüksHonda();
		lüksHonda.benzin();
		lüksHonda.direksiyon();
		lüksHonda.kapi();
		lüksHonda.klima();
		lüksHonda.koltuk();
		lüksHonda.move();
		System.out.println("Ic Araba interface'inden price: "+IcAraba.price);//2000
		System.out.println("Dis Araba interface'inden price: "+DisAraba.price);//3000
		System.out.println(indirim);//100
		System.out.println(old);//true     iki isimli old olmadigindan interface adi kullanmaya gerek yok
		lüksHonda.döseme();
		IcAraba.isitma();
		
	

	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km lik hiza ulasir");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarli kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Isitmali deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital kilima");
		
	}

}
