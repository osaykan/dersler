package day38interviewhazirlik;

public class InterviewHazirlik01 {
	
	//1)  Java "Platform Independent" (ortamdan bagimsiz) programlama dilidir.
	//    Yani; herhangi bir platformda yazilan Java kodu diger platformlardada calisir.
	//    Mesela kodu Mac'de yazdiniz, Windovsda da calisir
	
	//2) IDE ==> Integrated Developmend Enviroment (Entegre edilmis yazilim ortamidir) demektir. Eclipse ve IntelliJ piyasada kullanilan
	//           meshur iki IDE dir.
	
	//3) Constructor ==> Yeni bir obje üretilirken costructor aktive olur ve objeyi üretir.
	//                   Return type yoktur.
	//                   Ismi Class ismi ile ayni olmalidir.
	//                   Obje üretmek icin Constructor uretmek zorunda degiliz. Cünkü Java default bir Constructor üretmistir.
	//                   Default constructorlar parametresizdir.
	//                   Biz herhangi cons. ürettigimizde default cons.yok olur.
	//                   Cons. overload edilebilir.
	//                    Constructor lar child Classtan cagrilabilirler ama override edilemezler.
	
	//4) OOP Concept nedir?
	//                   OOP concept  a)Inheritance b) Encapsulation c)Polymorhism d) Abstraction  e) Interface icerir.
	
	/*5) Inheritance nedir?
	//                     Inheritance parant(super class)-child(sub class) iliskisidir.
	//                     A classi B classina extends ederse A child olur, B parent olur.
    //                     A classi B interface ine impliments  ederse A child olur, B parent olur.
	//                     A interface i B interfceine extends ederse A child olur, B parent olur.
	//                     Child parent'taki kodlarin public ve protected olanlarini  kullanabilir
	//                     Reusability(tekrar kullanabilme) , short coding , maintenanace(tamir) faydalari vardir.
	
	
	6) Encapsulation nedir?
	                       Data hiding(Data gizleme) demektir. Datalar private yaparak gizlenir.
	                       Gizlenen datalar getter() ile okunur, setter() ile uptade edilir.
	                       Degistirilmesini istemedigimiz kodlari koruma altina almak icin kullanilir.Maintenance faydasi da vardir.
	                       Kodun hic degistirilmesini istemiyor sadece okunmasini istiyorsaniz o zaman sadece setter() olusturmayiniz.( Immutable class)
	                       Kodun ne degistirilmesini nede okunmasini istiyorsaniz o zaman getter ve setter olusturmayiniz
	                       
	 7)Polymorphis nedir?
	                      Polymorphism(Coklu yapi) overloading ve overriding dir.
	                      
	 8)Abstract Class nedir?
	                       Abstract class üretmek icin abstract keyword kullanmaliyiz                                           
	                       Abstract class lardan obje üretilemez.(instantiate yapilamaz=görününürlük).
	                       Abstract class larda hem abstract hemde concrete methodlar bulunabilir.
	                       Abstract methodun oldugu class kesinlikle abstract olmalidir.
	                       Abstract methodlarin(body siz) concrete child lar tarafindan  override edilme zorunlulugu vardir. Concrete ler override
	                       edilmesede olur.
	              **       Abstract class i child class lari bazi görevleri yapmak zorunda birakmak icin olustururz. 
	              
	              
	 9)Interface nedir?             
	                      Java normalde multiple inheritance müsade etmez. Bu yüzden abs.class kullandigimizda multiple inheritance yapamayiz.
	                      Fakat bazi prijelerde multiple inheritance kullanmak zorunda kaliriz. Bunu Java bize interface kullanma hakki
	                      vererek halletmistir.
	                      Cünkü interface lere multiple implements/extends  yapilabilir.       
	                       
	 10) Overloading nedir?
	                      Method ismi ayni tutularak parametreler in sayilari , yerleri veya data type leri degistirilerek methodlar olusturmadir.
	                      Overloading compile timedir. Yani Overloading te yapilan hata kod yazarken belli olur.
	                      Ayni isme sahip methodlarla farkli islemler yapabilmek icin. Mesela substring(4) ve substring(4,7) 
	                      methodlarinin fonksiyonlari   esasinda aynidir ikiside bir stringin belli bir bölumunu almaya yarar. 
	                      Fakat bazi durumlarda bitis indexini söylemek gerekir
	                      bazi durumlarda gerekmez. Bunun icin parametreleri farklilastiririz. Buda overloadoingi dogurur.
	                      
	11) Overriding nedir?
	                     Method Signature'a(Method ismi+ Parametreler) dokunmuyoruz, sadece body'i degistiriyoruz.
	                     Overriding inheritance olunca olur.
	                     Ayni methodun farkli kullanimlari icin overriding gereklidir.
	                     Animal da ses() ==> Dog(){Havlama} ==> Kedi() {Miyavlama} 
	                     Overriding Run Time Error verir.
	                     
  12) Array ili ArrayList arasindaki farklar nelerdir?
                         Array olusturulurken uzunlugu belli edilmek zorundadir ve daha sonra uzunluk degistirilemez.
                         Fakat ArrayList te baslangicta uzunlugu belirtme zorunlulugumuz yoktur, eleman ekledikce uzunluk artar, 
                         eleman sildikce uzunluk azalir	                                                               
	                       
  13) String ile StringBuilder arasindaki fark nedir?
                         Stringler immutable dir, StringBuilder ise mutable dir.
                         StringBuilder classi daha fazla kullanisli methodlara sahiptir.
                         Mesela bir Stringi tersten yazmak icin kullanilan reverse() methodu gibi.	                       
	                       
	                       
	                       
	                       
	                       
	                       
	                       
	                       
	
	*/
	
}
