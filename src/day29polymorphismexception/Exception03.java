package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		//Bölme islemi yapan bir program yazalim
		
		int num1 =6;
		int num2=0;
		try{
			
		System.out.println(num1/num2);
		}catch(ArithmeticException e){
			System.out.println("Sifir ile bölme yapilamaz");
		}
	
	   //ArithmeticException  Run Time Exception dur. Mathematik kurallarina uygun olmayan bir islem yapildiginda
		//bu Exception alinir.
		
		//try'dan sonra birden fazla catch kullanilabilir. Ama üstteki catch alttaki catch'in childi olmalidir.
		//Specific ten genele dogru dizmelisiniz.
	}
	

}
