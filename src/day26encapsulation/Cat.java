package day26encapsulation;

public class Cat extends Mammal {

	
	public boolean clean = true;
	
	public static void main(String[] args) {
	Cat cat = new Cat();
	System.out.println("Animal Class'dan geldi: "+cat.age);//0
	System.out.println("Animal Class'dan geldi: "+cat.name);//null
	cat.eat();//Yemek yer
    cat.move();//Hareket edebiliyor
    
    System.out.println("Mammal Class'dan geldi: "+cat.dogum);//true
     cat.feed();//Cocuklarini besler
     
     System.out.println("Cat Class'dan geldi: "+cat.clean);//true
     cat.meow();//Kediler miyavlar
      
     
     
	}
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
