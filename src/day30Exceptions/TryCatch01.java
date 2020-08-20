package day30Exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
	
		
		int num1 = 12;
		int num2 = 0;
		//finally{} block herzaman calisir ve try-catch blocktan sonra kullanilir
		try{
			
			System.out.println(num1/num2);
		}catch(ArithmeticException e){
			
			System.out.println("Sifir ile bolme yapilamaz");
		}finally{
			System.out.println("Isleminiz bitmistir ");
		}
		
		
		// Interview:     final, finally, finalize keyword'lerinin farki nedir
		
		/*
		 1)finally{}(block) ==> try-catch block'tan sonra kullanilir.Exception olsada olmasada calisir
		 2) final(keyword)==> Variablelerde final kullanilirsa o variablenin degeri degistirilemez. Mesela pi sayisi
		             final yapildigi zaman degeri degistirilemez. final String code=" POS";
		             
		             Methodlarda final kullanilirsa, o methodun body kismi degistirilemez dolayisiyla overriding yapilamaz
		             
		             Class'larda final kullanilirsa o Class extends edilemez.Inheritance mumkun degildir.
		             public final class Animal{   }==> public class Dog extends Animal{    }   OLMAZ
		             
		             
		 3) finalize()(method) ==>  finalize() methodu , Garbage Collectorin imha edecegi datalari imha edecek hale getirir.
		             
		             
		             
		 */
		

	}

}
