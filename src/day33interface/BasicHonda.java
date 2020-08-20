package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		//Class ==> Interface : implements
		//Class ==> Class : extends
		//Interface ==> Interface : extends
		

		BasicHonda basicHonda = new BasicHonda();
		basicHonda.benzin();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		basicHonda.döseme();
		
		
		
	}

	@Override
	public void move() {
	
		System.out.println("10 saniyede 100km lik hiza ulasir");
		
	}

	@Override
	public void kapi() {
		System.out.println("Kumandali  kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Plastic direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Suni deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Manual kilima");
		
	}

}
