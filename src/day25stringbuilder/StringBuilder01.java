package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class'i String uretmeye ve �retilen Stringleri manipule etmeye yarar.
		
		
		//String classi kullanarak string �retirseniz yapilan degisiklikler ilk �retilen stringi etkilemez
		// Ama  illa ki ilk �rettigimiz String degissin isterseniz atama yapmak zorundasiniz
		//String classi kullanarak �rettiginiz Stringler atamasiz degistirilemedigi icin String Class ina "immutable" denir
		
		String str ="Ali";
	//	str=str.substring(1);   //==> li   zaten yapiliyordu.Atama yapinca eskisi yok olur.
		str.substring(1);       //
		System.out.println(str);  // atama yapilmasaydi yine Ali yazardi �nceki degisiklik str ye yansimiyor
		                          //atama olunca �ncekinide yansitiyor
		//StringBuilder classini kullanarak string �retirseniz yapilan degisiklikler ilk �retilen stringi etkiler
				//  atama yapmaya gerek yoktur
		//StringBuilder Class'i degisimi yansittigi icin ona "mutable" denir.
				
				
		//1.Yol:
		StringBuilder strBld1 = new StringBuilder("Veli");
		strBld1.append("Can"); //append() methodu Stringe yeni bir String eklemek icin kullanilir.Concatenation yapar
		
		System.out.println(strBld1);
		
		
		//2.Yol:
		StringBuilder strBld2 = new StringBuilder(); //bos bir String �retti==> ""
		strBld2.append("AliCan");//Bos Stringe AliCan ekledi
		
		//3.Yol:
		StringBuilder strBld3 = new StringBuilder(7);//Uzunlugu 7 character olan bir String �retildi
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");   //Fazla character atadik kendini b�y�t�r.Basta 7 yazmistik ama uzatti
		//Olusturdugunuz Stringin uzunlugunu belirledikten sonra o uzunluktan az veya cok Stringler ekleyebilirsiniz.
		//Stringler problem cikarmaz.
		System.out.println(strBld3);
		
		

	}

}
