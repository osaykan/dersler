package day18statickeyword;

public  class Static01 {

	static int en = 12;
	static int boy = 10;
	static int alan ; 
	static double pi;
	static int yaricap = 4;
	
	//Eger bir variable'in degerini olustururken hesap yapmamiz gerekirse static blocck olusturmak iyidir
	//Yani int alan = en* boy demek yerine "static block" olusturup bu islemleri static block un icine yazmak daha iyidir.
	//"static blok" variable'lara deger atamak icin de kullanilabilir.
	//static blok class'in icinde b�t�n methodlarin disinda ve constructor larin disinda olusturulmali
	
	//static block class olusturuldugu zaman olusturulur.
	
	//static block t�m methodlardan(main method dahil) ve constructorlardan �nce calistirilir
	
	//Birden fazla static block varsa ustteki �nce calisir
	
	static {
	
		pi=3.14;   //�nce pi nin calismasini istiyorsak �ste yazmaliyiz.
	}
	static {
		alan = en*boy;
		
	}
	
	
	public static void main(String[] args) {
		

	}


//static class olusturulabilir ama alt classlar(inner class) static class olabilir.
	//�st classlar (auter class) static olamazlar.


 static class AltClass {
 }	
}





