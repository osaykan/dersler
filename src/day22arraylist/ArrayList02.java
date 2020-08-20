package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//toArray() methodu methodu listi array'a cevirmek icin kullanilir.
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		System.out.println(list);//[Ali, Can]
		
		list.toArray();
	String arr[] =  list.toArray(new String[0]);   //1.yol () icine new String[0] yazilir
	System.out.println(Arrays.toString(arr));
	
	Object[] arr1 = list.toArray();
	System.out.println(Arrays.toString(arr));    //2.yol: Olusturulan array in data type ni object olarak secin.
	                                            //Object javada bütün classlarin parent'i dir.
	                                             //Yani Object class ortak atadir
	//Object class Javada parent i olmayan tek class dir
	//String, Object class in child i oldugundan data type olarak bazi durumlarda string yerine Object kullanabiliriz.

	
	
	//asList () methodu array leri liste cevirmek icin kullanilir
	//asList () methodu parametre olarak array'in ismini kabul eder.
	
	String arr2[]={"Alie","Canan"};
	Arrays.asList(arr2);
	List<String> list1 = Arrays.asList(arr2);
	System.out.println(list1);                //[Alie, Canan]
	
	//Array den liste cevirme yaptiginizda elde ettiginiz list uzunluk olarak esnek degildir.
	//Yani arrayden olusturulan liste ekleme ve cikarma yapamazsiniz.
	
	//list1.add("Emine"); //add() veya remove() yapilamaz hata verir Run Time Error verir "UnsupportedOperationException"
	//System.out.println(list1);
	list1.set(0,"Kemal");         //set() methodu calisir.
	System.out.println(list1);
	
	
	
	
	
	
	
	
	}

}
