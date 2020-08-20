package day27constructorcagirma;

public class Dog extends Mammal {
	
	public boolean sadik = true;
	

	public static void main(String[] args) {
        	
		Dog dog = new Dog();
	
          
	}

	public void bark() {
		System.out.println("Köpekler havlar");
	}
	
	Dog() {
		super(); //istege bagli koysanizda olur koymasanizda
		        //this() ayni class icindeki parametresiz constructor i cagirmak icin kullanilirdi
		System.out.println("Dog parametresiz constructor");
	}
	
	
	
}
