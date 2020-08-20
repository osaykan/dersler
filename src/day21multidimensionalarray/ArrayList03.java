package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		//["Ali","Can","Ayse","Ali"] olusturun
       List<String> list = new ArrayList<>();
       
       list.add("Ali");
       list.add("Can");
       list.add("Ayse");
       list.add("Ali");
       System.out.println(list);    //[Ali, Can, Ayse, Ali]
       
       list.remove("Ali");             //1.Aliyi burada sildi
       System.out.println(list.remove("Ali"));//ilk elemani sildinmi true    //ikinci liyi sildinmi
       System.out.println(list);    //[Can, Ayse, Ali] ilk Ali yi sildi
       list.remove("Ali");                                                  //3.Aliyi siliyor
       System.out.println(list.remove("Ali"));//Ali kalamadigi icin silemedi false verir   //4.Aliyi sildinmi
       System.out.println(list);   //[Can, Ayse]
       
       list.remove("Kemal");
       System.out.println(list);   //[Can, Ayse] listede olmayan elemanlar icin hata vermez.
       System.out.println(list.remove(0));//Can i siler ve silinen elemani verir
       System.out.println(list);
       //"Ayse" elemanini "Aysegül" yapin . set() methodunu kullanilir
     //  list.set(0, "Aysegül");
       System.out.println(list.set(0, "Aysegül"));//Direk yazdirilirsa degisecek elemani Ayse verir
       System.out.println(list);          //[Aysegül]
       
       
       //Kenan ve Zeynep ekleyin
       list.add("Kenan");
       list.add("Zeynep");
       System.out.println(list);    //[Aysegül, Kenan, Zeynep]
       
       list.clear();   //Bütün elemanlari siler
       System.out.println(list.isEmpty());  //Hepsi silindimi diye kontrol ediyoruz true
       System.out.println(list);   //[]  hepsini sildi
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
