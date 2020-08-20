package day19arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//4 elemanli char bir array olusturun . Bu array e elemanlar yerlestirin
		//Tüm elemanlari for döngüsü kullanarak yazdirin
		//Sadece son elemani ekrana yazdirin
		
		char arr1[] = new char[4];
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
       
		for(int i = 0; i<4;i++){
			System.out.print(arr1[i]+" ");
			 System.out.println(arr1[arr1.length-1]);
			//Array in length'ini bulmak icin arr1.length yazmak yeterli.
			 //String lerdede length methodu kullanilir,ama  Stringlerdeki parantezlidir length()
			 //String==> length()
			 //Array==> length
			 System.out.println(arr1.length);//4
			 System.out.println(arr1);
			 System.out.println(Arrays.toString(arr1));
		}
		
	}

}
