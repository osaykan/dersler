package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int num1 = 12;
		
		//Uzun yol ile carpma yaparak increment
		num1 = num1*3;
		System.out.println(num1);
		
		//Kisa yol
		
		num1*=3;  // 36*3
		System.out.println(num1);
	
		
		//Uzun yol ile bölme yaparak decrement
		
		num1 = num1/9;
		System.out.println(num1);
		
		// Kisa yol
		
		num1/=2;
		System.out.println(num1);
		
		
		

	}

}
