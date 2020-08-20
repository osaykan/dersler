package day30Exceptions;

public class TryCatchSoru02 {

	public static void main(String[] args) {
	    try {
	        hop ();
	        
	    }catch (Exception e) {
	        System.out.println(e.getMessage());   //exceptionu yakala sadece mesaji yazdir demek
	    }
	}
	private static void hop() {
	    throw new RuntimeException ("cannot hop");   //cannot hop


	}
}
