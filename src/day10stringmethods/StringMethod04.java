package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		//contains() methodu bir Stringin icinde bir characterin olup olmadigini kontrol eder.
		//Eger varsa true yoksa false return eder.
		
		String str1 = "karakartal";
	    System.out.println(str1.contains("m"));// false cunkü m yok
	    System.out.println(str1.contains("kar"));
	    System.out.println(str1.contains("Kar"));//false K yok
	    
	    
	    
	    //trim() methodu bir Stringin bas ve sonundaki bosluklari siler.Trim==tras " Ali " ==> "Ali"
	    // trim() metodu aradaki bosluklari silmez
	    
	    String str2 = " Ali Can     ";
	    System.out.println("trim() kullanmadan önce :"+str2);
	    System.out.println("trim() kullandiktan sonra :"+str2.trim());

	    
	    // isEmpty() methodu bir Stringin icinde character olup olmadigina bakar
	    //varsa false, yoksa true
	    
	    String str3 = "Ali";
	    System.out.println(str3.isEmpty());
	    
	    String str4 =" ";
	    System.out.println(str4.isEmpty());// false cünkü space bir characterdir
	    
	    String str5 = "";
	    System.out.println(str5.isEmpty());// true character yok
	    
	    
	    //Note: isEmpty() true cikarsa length i sifirdir.
	    
	    
	    
	    
	    
	    
	}

}
