package day26encapsulation;

public class Dog extends Mammal {
	
	public boolean sadik =true;

	public static void main(String[] args) {
	  Dog dog = new Dog();
	System.out.println("Animal Class'dan geldi: "+ dog.age);  //0  default value atadi
	System.out.println("Animal Class'dan geldi: "+dog.name);   // null default value
	dog.eat();// Yemek yer    void oldugu icin syso nun icine koymadik.
	dog.move();//Hareket edebilir
	
	System.out.println("Mammal Class'dan geldi: "+dog.dogum); //true
	dog.feed();//Cocuklarini besler.
	
	System.out.println("Dog Class'dan geldi: "+dog.sadik);//true
	dog.bark();//havlar

	}
	
	public void bark() {
		System.out.println("Köpek havlar");
	}

}
