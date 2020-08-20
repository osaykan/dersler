package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki array olusturup bu arraylarin birbirine esit olup olmadigini kontrol ediniz
		//Not: Iki arrayin esit olmasi icin
		//      1) Elemanlari ayni olmali
		//      2) Esit elemanlarin indexleri de esit olmali
		// {1,2,3} ve {1,2,3} esittir. Ama {1,2,3} ile {1,3,2} esit degil
		
		int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};
        
        System.out.println(arr1==arr2);   // false veriyor cünkü referencelere ve degerlere bakiyor
                                          
        System.out.println(Arrays.equals(arr1, arr2));  //Arrays in icindeki equalsi secmeliyiz true verir cünkü
                                                       //Arrays.equals() methodu sadece degerleri ve indexleri kontrol eder,adreslere bakmaz
        
	}

}
