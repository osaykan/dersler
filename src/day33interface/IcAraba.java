package day33interface;

public interface IcAraba {
	int price = 2000;
	boolean old = true;
	
	public abstract void direksiyon();
	void koltuk();
	abstract void klima();
	//default keywordunu kullanirsak methoda body eklemek zorundayiz.
	//Aksi taktirde Compile Time Error aliriz
	
	public default void döseme(){
		System.out.println("Interface'de default keyword ile döseme yaptim");
		
	}

	public static void isitma(){
		System.out.println("Interface'de static keyword ile döseme yaptim");
		
	}

}
