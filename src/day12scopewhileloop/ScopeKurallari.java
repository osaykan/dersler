package day12scopewhileloop;

public class ScopeKurallari {
        
	int num;//Class variable veya Instance Variable
	
	public static void main(String[] args) {
		//Scope kapsam demektir.Olusturdugumuz bir variable i nerelerde kullanacagimizi gösterir.
       //Main methodunun disinda Baska bir toplama methodu olusturalim
	}
	public void toplama(){
	//	int num1 = 12;
		System.out.println("Toplama");
		
	}

	public void carpma(int num,String str){
//		int num2;
//		num2 = 3;
		
		System.out.println("Carpma");
	}
}



//1.Kural: Clasin icinde methodlarin disinda olan veriable leri bütün methodlar istedikleri zaman istedikleri kadar kullanabilirler.
//         Bu veriable lere "Class Variable" veya "Instance Variable" denir.
//         Class variablelere deger atamasi yapmazsak Java onlara default(kafasina göre) degerler verir.Java tüm sayilar icin default olarak 0 degerini verir.

//2.Kural:Bir methodun body si icinde olusturulan variable ler sadece o methodun icinde kullanilir.O methodun disindaki methodlar o variable i kullanamazlar.
//        Methodun icinde olusturulan bu variable lere "Local Variable" denir.
//         Body icinde olusturulan variablelere deger atamak ZORUNDAYIZ. Java onlara default value vermez.

//3.Kural: Methodlarin parantezleri icinde olusturulan variableler local variableler gibi  sadece o methodlarin body leri iocinde kullanabilir.Bunlarada local variable denir.
//         Parantez icinde olusturulan variable lere ise deger atamasi yapmayiniz.

//4.Kural: Bir variable yi kullanmaya baslamadan once tanimlamaliyiz.Önce num=num+2 sonra int num=12; diyemeyiz.Tersi olmali








