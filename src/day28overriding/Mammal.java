package day28overriding;

public class Mammal extends Animal {
	
	public boolean birth = true;
	public String name = "Kedi";

	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();
	

	}
	public void feed(){
		System.out.println("Yavrularini besler");
	}
	
	public Mammal(){
		
		//this icinde bulundugunuz Classtaki variable ve methodlara ulasmanizi saglar
		
		System.out.println(this.birth);//true
		this.feed();//Yavrularini besler
		//Child Parent iliskisi varsa this kullanarak parent classtaki variable ve methodlarida cagirir.
		//Ama parent classlardakine ulasmak icin this kullanmayin.
		//Cünkü chil ve parentdeki ayni isimli variable ve methodlarda problem yasarsiniz.
		//Genel kullanimda this Class icindekiler icin, super parent dakiler icin kullanilir.
		//farklilik yapip insanlari sasirtmayin.
		
		System.out.println(this.age);//4
		System.out.println(this.name);//Kedi
		this.move();//Hayvanlar haraket eder
		System.out.println(this.name);//Kedi      
		
		//Parantezsiz super parent lardaki variable ve methodlara ulasmanizi saglar.Baba ve dedelere ulasir
		//Parent dakilere super kullanarak ulasmak daha güvenlidir
		System.out.println(super.age);//4
		System.out.println(super.name);//Karabas
		super.move();//Hayvanlar hareket eder
		
		
	}

}
