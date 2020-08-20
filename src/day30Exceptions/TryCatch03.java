package day30Exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
	   System.out.println(exceptions());

	}
	
	@SuppressWarnings("finally")
	public static String exceptions(){
		String result ="";                //1.adim  bos
		String v = null;                  //length calismaz
		
		try{
			try {
				result = result+ "before";    //2.adim    result="before"
				v.length();                   //3.adim NullPointException oldugu icin catch(Null...) a gider
				result = result+"after";  //atlar okumaz
			}catch(NullPointerException e){
				result=result+"catch";       //4.adim   result= "beforecatch"    olur
				throw new RuntimeException();  //5.adim da Exception atar catch yok birakir
				
			}finally{                         //6.adim  mutlaka finally calisir
				result=result+ "finally";     // result="beforecatchfinally";
				throw new Exception();        // tekrar exception atar ve alttaki  catch yakalar
			}
		}catch(Exception e) {                //7.adimda buraya gelir
			result=result+"done";            // result="beforecatchfinallydone";
		}
		return result;                   //Bu satir main methodunda yazdirir.
	}
	
	
	
	//                throw ile throws keywordlerinin farki
	//1) throw method body'si icine yazilir, throws methdo parantyezi ile curly
	//   brace'in arasina yazilir
	//2) throw'u method body'si icinde exception almak istedigimiz yerde kullanabiliriz
	//   throws ise mecburen method isminden sonra bir kere kullanilabilir
	//3) 1 throw sadece 1 tane exception uretir, 1 throws ile birden cok 
	//   exception uretebilirsiniz
	//   Yani " ) throws NullPointerException, ArithmeticException { " mumkun
	//4) throw icin syntax ==> throw new NullPointerException;
	//   throws icin syntax ==> throws NullPointerException


}
