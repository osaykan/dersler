package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat() method concatenation yapmanin yani iki Stringi birlestirmenin diger yöntemidir
		
		String str1 = "Ali";
		String str2 = "Veli";
		System.out.println(str1+str2);//AliVeli
		System.out.println(str1.concat(str2));//AliVeli  yukardaki ile ayni sonucu verir.
		
		System.out.println(str1.concat(str2).concat(str1));//AliVeliAli concat i istedigimiz kadar pespese kullanabiliriz.
		System.out.println(str1.concat("==>").concat(str2));
		
		
		//replace() methodu var olan bir characterin bütün görünümlerinin yerine baska character yazmaya yarar.
		//ata ==> ana    gibi
		
		
		
		// replace() 1. versiyon
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));//ana
		System.out.println(str3.replace("a", "ü"));// bütün a lari bulup degistiriyor
		System.out.println(str3.replace("x", "y"));// islem yapmaz x yok.
		System.out.println(str3.replace("", "y"));//hicbirsey yerine y yazacak. Her serde var. yaytyay
		System.out.println(str3.replace("", "/"));//  /a/t/a/
		System.out.println(str3.replace("", " "));// a t a 
		System.out.println(str3.replace("t", ""));// t yi siler. Stringten bir karakteri silmek icin kullanilir
		System.out.println(str3.replace("a", ""));// a lari siler
		System.out.println(str3.replace("at", "Mustaf"));// at kaldirir Mustaf yazar
		System.out.println(str3.replace("at", "y"));
		
		
		
		//replaceFirst() methodu degistirmek istedigimiz karakterin  sadece ilk görünümünü degistirir.
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K"));// ilk k yerine K yazar
		System.out.println(str4.replaceFirst("a", "e"));//kerakartal
		System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
		System.out.println(str4.replaceFirst("kar", ""));// ilk kar i siler.
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom
		
		//Soru
		String text = "Ali okula gitti.Ali otobüse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.Cinali ";
		System.out.println(text.replace("Ali", "Veli"));
		
		
		//replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar. replace() methodunda istenirse  tek harfli characterler icin tek tirnak kullanabilirsiniz.
		
		
		
		
		
		
		
	}

}
