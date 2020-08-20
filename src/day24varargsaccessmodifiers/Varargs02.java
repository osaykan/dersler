package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
	//Varargs in yanlis kullanimlari
		
		//Kural 1: Varargs herzaman son parametre olmalidir.
		//Cünkü ilk parametre yaparsaniz girdiginiz her deger varargs in icine düser.Asla ikinci parametreye deger veremezsiniz
		
		valueChar("Character:",'a');
		valueChar("Character:",'a','b');
		
	//	product(1,2,3,4);
		
		product(5,2,3,4);  //5 i kullanmadigimiz icin carpmadi
		
		
	}
	
	public static void valueChar(String s, char...c) {
		for(char w:c) {
			System.out.print(s);
			System.out.println(w);
		}
		
	}
	
	//Kural 2: Parametre olarak 1 den fazla varargs kullanamazsiniz
	//Cünkü Varargs en sonda olmalidir, en sonda olmak tek olmayi gerektirir.
//
//	public static void product(int... x, int y){
//		int product = 1;
//		for(int w: x) {
//			product=product*w;
//		}System.out.println(product);
//		
//	}
//	
	public static void product(int x, int... y){
	int product = 1;
		for(int w: y) {
			product=product*w;
	}System.out.println(product);
	System.out.println(x);	
	}

	
}
