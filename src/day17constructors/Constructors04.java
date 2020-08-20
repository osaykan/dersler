package day17constructors;

public class Constructors04 {

	int num1 = 12;
	static int num2 = 22;
	
	
	public static void main(String[] args) {
	
		//Static methodlarin icinde sadece static elemaalar kullanilabilir
		//num1 static olmadigindan main methodunun icinde kullanilamaz
		//num2 static oldugundan main methodunun icinde kullanmamiz problem olmuyor.
	//	num1++;
		num2++;
		toplamak(15);
		Constructors04 ctr = new Constructors04(); 
		int num3 =ctr.num1;
		System.out.println("num2+num3= "+(num2+num3));
	}
	public static	void toplamak(int num1){
		num1++;
		System.out.println(num1);
		
		}
	

}
