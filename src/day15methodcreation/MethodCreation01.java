package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
	
		
	//	toplama();            //Sonra col(cagiriyoruz) yapiyoruz.Bu satir olmazsa birsey yazdirmaz.
		System.out.println( toplama(3,5)); //Parametreli tanimlandigi icin sayi koymaliyiz.Adi Argument                                       
		//carpma();
		System.out.println(carpma(13,5));
	}
//Methor parantezinin icinde olusturulan variablelere parametre denir
	//Method cagrilirken method parantezinin icine yazilan degerlerede Argument denir
	//Parametrenin data type i ile Argumentin data type i eslesmeli.
	
	//public static void toplama(){      //Bu birsey üretmez üretmesini istiyorsak int gibi bir method tanimlamaliyiz.
	//System.out.println(3+5); 
	// }
	    public static int toplama(int num1,int num2){                         //disarda  toplamayi önce yazdik
		           return num1 + num2;                         //Bir methodu main methodunun icinden cagirmak icin mutlaka static kelimesini kullanmaliyiz
	}
	
	//public static void carpma(){
		//System.out.println(3*5);
	//}
	    
	    public static int carpma(int num1,int num2){
	    	return num1*num2;
	    }
}
