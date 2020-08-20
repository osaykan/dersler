package day30Exceptions;

public class TryCatchSoru03 {

	public static void main(String[] args) {
	    try {
	        hop ();
	        
	    }catch (Exception e) {
	       e.printStackTrace();   //daha detayli veriyor.15 ve 7 satirlarda hata oldugunuda olusum sirasina göre gösteriyor
	       //System.out.println(e);     //java.lang.RuntimeException: cannot hop  bunu verirdi
	    }
	}
	private static void hop() {
	    throw new RuntimeException ("cannot hop");   


	}
	
//	java.lang.RuntimeException: cannot hop
//	at day30Exceptions.TryCatchSoru03.hop(TryCatchSoru03.java:15)
//	at day30Exceptions.TryCatchSoru03.main(TryCatchSoru03.java:7)
}
