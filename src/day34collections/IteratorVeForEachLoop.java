package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {      //Iterator bir collectiondaki elemanlar arasinda gezer ve o elemanlari degistirir.
	                                      //Ali yi Veli yapar a yi b ye cevirir gezerken.Bu bir class tir.

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
	list1.add("X");
	list1.add("Y");
	list1.add("Z");
	System.out.println(list1);//  [X, Y, Z]

	Iterator<String> iterator = list1.iterator();      //obje olusturduk list1 i kullanarak
	
	//hasNext() methodu bir sonraki eleman varni yokmu diye kontrol eder
	//==>X,Y,Z   X in önünde bakar ve benden sonra  bir sey var der true olur.Sonra Y nin önüne gider bir true daha alir,
	//sonra Z den dolayi tekrar true olut sonunda kalmayinca false verir ve döngü biter.
	//next() methodu yazilmali ve derki iterator'a git önündeki elemani yazdir der.sonraki anlaminda i++ gibi
	
	//Asagidaki kod iterator kullanarak list'teki tüm elemanlari ekrana yazdirir.
//	while(iterator.hasNext()){
//		System.out.print(iterator.next());  //XYZ
//		
//	}
	
	//for-each loop kullanarak ekrana yazdirin
	System.out.println();   //Bir satir asagiya kaymasi icin yazdik
	
	for(String w: list1){
		System.out.print(w);     //XYZ
	}
	System.out.println();
	//for-each loop ile degisim yapmaya calisalim ama degismedigini görecegiz
	for(String w: list1){
	w=w+"A";
	}
	System.out.println(list1);   //[X, Y, Z]
	
	System.out.println("atla");
	//Iterator ile for-each loop farki:
	//for-each loop elemanlar arasinda gezer ama collectionu degistirmez
	//Iterator ise elemanlar arasinda gezer ve collectionu degistirebilir
	
	while(iterator.hasNext()){
	   iterator.next();    //sirasiyla ilerletir
	   iterator.remove();   //remove() methodu eleman sirasiyla siler
	   
	}
	System.out.println(list1);   //[]
	
	
	
	
	
	
	
	
	
	
	}

}
