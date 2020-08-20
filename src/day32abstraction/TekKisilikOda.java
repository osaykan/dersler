package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {

		
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti();
		System.out.println("TV Ucret: "+musteri1.tv(5));
		System.out.println("Wifi Ucret: "+musteri1.wifi(1));

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
		
	}
	public int tv(int saat){
		return saat*2;
	}

	
	//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child�lar tarafindan override edilmese de olur
}
