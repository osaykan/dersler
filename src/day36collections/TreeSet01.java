package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
       
		//TreeSet : 1) HashSet ile hemen hemen aynidir. Dublication'a müsade etmez
		//            key-value yapisi kullanir.
		//          2) HasfSet ile farki; TreeSet elemanlarini natural order'a göre dizer. HashSet rast gele dizer
		//          3) HasfSet ile farki; HashSet daha hizlidir
		//          4) Natural Order'a sahip bir Set lazim oldugunda HashSet olusturulur, elemanlar eklenir
		//            sonra bu HashSet TreeSet' e dönüstürülür,böylelikle TreeSet'in hiz problemi halledilir.
		//             Natural Order'a sahip bir Set lazim oldugunda Direkt TreeSet olusturma genellikle kullanilmaz.
		
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		
		System.out.println(tSet); //[ABC, Ink, Jack, Pen, String, Test]  alfabetik sirada
		//HashSet olusturup Java nin elemanlari hizli eklemesini saglariz
		HashSet<String> hSet1 = new HashSet<>();
		
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);  //[ABC, Test, Ink, Pen, String, Jack]  alfabetik sira yok
		
		//Olusturdugumuz HashSet i TreeSet constructor ina parametre olarak koyup TreeSet e ceviririz, ve siralama yapilir.
		TreeSet<String> tSet1 = new TreeSet<>(hSet1); //HashSet TreeSet e dönüstürüldü
		System.out.println(tSet1);    //[ABC, Ink, Jack, Pen, String, Test]

		
	}

}
