package day30Exceptions;

public class TryCatch02 {
	  static String m;

	public static void main(String[] args) {
		
		
		String s="";
		System.out.println(s.length());//0
		try{
			s+="t";
		}catch(Exception e){
			s+="c";
			
		}finally{
			s+="f";
		}
        s+="a";
        System.out.println(s);//tfa   S bos sonra t ilave edildi.finally her durumda calisir ve f ilave eder tf olur
                              //alttaki bölum de try-catch disinda ,o da daima calisir ve tfa olur.
        
        String n = null;
                                         //Stringe null atandigi zaman veya instance variable ye deger atamasi yapilmadiginda
                                         //length() methodu calismaz ve
    //    System.out.println(n.length());  // null bir objedir uzunlugu ölcülemez. NullPointerException verir. Run Time Exception dur.
     //   System.out.println(m.length()); 
        
        
	}

}
