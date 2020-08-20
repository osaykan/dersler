package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		
		KralDairesi krl = new KralDairesi();
		krl.kahvalti();
		System.out.println("TV Ucreti: "+krl.tv("international", 12));
		System.out.println("Wifi Ucreti: "+krl.wifi(11));
	

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat Kral Restauranttadir");
		
	}
	public int tv(String international, int saat){
		if(international.equals("international")){
			return saat*5;
		}else{
			return 0;
		}
	}

}
