package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		
	char harf1 = 'a';// a nin degeri 97
	char harf2 = 'b';//98
	
	System.out.println(harf1 + harf2);// 97+98=195 olur. + varsa sayi gibi düsünüyor
	
	System.out.println(harf1);//a
	System.out.println(harf2);//b
	
	System.out.print(harf1);// ab yazdirmak icin ln kaldirdik
	System.out.println(harf2);
	
	
	// Bir char in sayi degeri ASCII tablosu kullanmadan nasil bulunur
	// Data type i int olan bir variable olustur ve char i bu variable a ata
	
	  // 97 tam sayi
	int aCharDegeri = 'a';
	System.out.println(aCharDegeri); //97 gelecek
	
	int ünlemCharDegeri = '!';
	System.out.println(ünlemCharDegeri);
	
	int yüzdeCharDegeri = '%';
	System.out.println(yüzdeCharDegeri);
	
	int asteriksCharDegeri = '*';
	System.out.println(asteriksCharDegeri);
	
	System.out.println("Nehaber");
	
	
	}

}
