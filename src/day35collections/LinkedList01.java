package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {        //Eklemede ve cikarmada LinkedList kullanmak avantajlidir.
	
		//Linked list objesi olusturunuz.(Linked list bir class)
		LinkedList<String> linkList=new LinkedList<>();
		
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		System.out.println(linkList);   //[Mark, Amanda, John, Ann, Pamela]
		
		linkList.remove(2);
		System.out.println(linkList);  //[Mark, Amanda, Ann, Pamela]   2.indexteki John gitti 
		
		linkList.removeFirst();
		System.out.println(linkList);   //[Amanda, Ann, Pamela]   ilk endex gitti
		
		linkList.removeLast();
		System.out.println(linkList);  //[Amanda, Ann]
		
		linkList.add(1, "Ali");
		System.out.println(linkList);  //[Amanda, Ali, Ann]
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);//  [Kemal, Amanda, Ali, Ann]
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);   //[Kemal, Amanda, Ali, Ann, Zeynep]
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList); //[Kemal, Ajanda, Ali, Ann, Zeynep]
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList.addAll(linkList2);
		System.out.println(linkList);  //[Kemal, Ajanda, Ali, Ann, Zeynep, X, Y]
		
		linkList2.addAll(linkList);
		System.out.println(linkList2); //[X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, X, Y]
		
		linkList.addAll(3,linkList2);
		System.out.println(linkList);  //[Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, X, Y, Ann, Zeynep, X, Y]
		
		
		
		System.out.println(linkList2.contains("Can"));  //false
		System.out.println(linkList2.contains("Ali"));  //true
		
		linkList2.clear();
		System.out.println(linkList2);  //[]
		
		
		//Linked list'de head haric her eleman icin bir data birde pointeri vardir. (A data)
		//head'de sadece pointer var   head==>bas
		//Her elemanin pointeri bir sonraki elemani gösterir, son elemanin'in(tail) pointeri Null gösterir.  Head==> A pointer==>B pointer==>null
		//Data ve Pointer iceren her elemanin diger adi "Node" dur.
		//Linked list eleman ekleme ve cikarma durumunda basarilidir.
		
		
		
             
	}

}
