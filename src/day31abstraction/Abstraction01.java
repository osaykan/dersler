package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
	    // Abstract class'lardan obje üretilemez.
		//Constractor lari yoktur
		//Abstract class'lar concrete(bood'li) ve Abstract(body'siz) methodlar icerebilir
		//Abstract class'larin hem concrete class hemde Abstract class olan childleri olabilir.
		//Abstract class'in childi concrete class ise Abstract class'daki Abstract methodlari mutlaka override etmeli ve onlara boddy eklemelidir
       //==> Bunun faydasi sudur; Child classlarda mecburen olmasi gereken methodlari bu sekilde belirlemis oluruz.
		
		
		
		//Abstract class'in childi abstract class ise Abstract class'daki hehangi bir seyi override etmek zorunda degildir

	}
	
	public  void concreteMethod(){
		System.out.println("Ben concrete'im");
	}

	public  abstract void abstractMethod();     //abstract method static kabul etmedi.
}
