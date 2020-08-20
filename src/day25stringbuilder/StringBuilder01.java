package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class'i String uretmeye ve üretilen Stringleri manipule etmeye yarar.
		
		
		//String classi kullanarak string üretirseniz yapilan degisiklikler ilk üretilen stringi etkilemez
		// Ama  illa ki ilk ürettigimiz String degissin isterseniz atama yapmak zorundasiniz
		//String classi kullanarak ürettiginiz Stringler atamasiz degistirilemedigi icin String Class ina "immutable" denir
		
		String str ="Ali";
	//	str=str.substring(1);   //==> li   zaten yapiliyordu.Atama yapinca eskisi yok olur.
		str.substring(1);       //
		System.out.println(str);  // atama yapilmasaydi yine Ali yazardi önceki degisiklik str ye yansimiyor
		                          //atama olunca öncekinide yansitiyor
		//StringBuilder classini kullanarak string üretirseniz yapilan degisiklikler ilk üretilen stringi etkiler
				//  atama yapmaya gerek yoktur
		//StringBuilder Class'i degisimi yansittigi icin ona "mutable" denir.
				
				
		//1.Yol:
		StringBuilder strBld1 = new StringBuilder("Veli");
		strBld1.append("Can"); //append() methodu Stringe yeni bir String eklemek icin kullanilir.Concatenation yapar
		
		System.out.println(strBld1);
		
		
		//2.Yol:
		StringBuilder strBld2 = new StringBuilder(); //bos bir String üretti==> ""
		strBld2.append("AliCan");//Bos Stringe AliCan ekledi
		
		//3.Yol:
		StringBuilder strBld3 = new StringBuilder(7);//Uzunlugu 7 character olan bir String üretildi
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");   //Fazla character atadik kendini büyütür.Basta 7 yazmistik ama uzatti
		//Olusturdugunuz Stringin uzunlugunu belirledikten sonra o uzunluktan az veya cok Stringler ekleyebilirsiniz.
		//Stringler problem cikarmaz.
		System.out.println(strBld3);
		
		

	}

}
