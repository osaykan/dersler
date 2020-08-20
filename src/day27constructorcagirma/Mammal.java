package day27constructorcagirma;


public class Mammal extends Animal {
	
	public boolean dogum = true;
	

	public static void main(String[] args) {

	//	Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);

	}

	
	public void feed(){
		System.out.println("Cocuklarini Besler");
	}
	
	
 Mammal(){                                   //constructor
	 
	 this(11);   //bazen ilk satirda bu gözükür.Parent'daki parametresiz constructor i cagirir.
	            //super() keywordunu yazmasanizda olur ama bazilari kullanir
	            //super() kullanilacaksa mutlaka ilk satirda olmali
	            //super() ve this() ayni constructor'un icinde ayni anda kullanilamaz
	            //cünkü ikisininde ilk satirda olma zorunlulugu vardir.
	 System.out.println("Mammal parametresiz constructor");
	 
 }
	 Mammal(int age){
		super();
		System.out.println("Mammal parametreli constructor");
	}
	
}
