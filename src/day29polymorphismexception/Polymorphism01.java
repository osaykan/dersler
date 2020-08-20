package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
	  //Polymorphism==> Coklu yapi
		//Overloading(Parametreyi degistirmek) ve Overriding(Body degistirmek) ile bir method Polymorphism haline getirilir.
		//Polymorphism i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
		//               diger adi static Polymorphismdir.
		//Polymorphism i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
		 //              diger adi Dinamic Polymorphism dir.             

	}
	
	public void eat(){
		System.out.println("Ye!");
	}
	//Overloading ile polymorphism yaptik
	public void eat(String name){
		System.out.println("Ye!");
	}
}
class Yeni extends Polymorphism01{    //Farkli class
	//Overriding ile polymorphism 
	public void eat(){
		System.out.println("Lütfen Ye");
	}

}
