package day20arrays;

import java.util.Arrays;

public class Ubung1 {

	public static void main(String[] args) {
		//1.Soru
		
//		int arr[] = {11, 12, 13, 14};

	//	Yukarida verilen array ile ilgili asagidakilerden hangisi yanlistir?

//		//A
//		System.out.println(arr[1]);
//
//		//Ekrana 11 yazdirir.
//
//		//B
//		for(int i=0; i<4; i++) {
//
//					System.out.print(arr[i] + " ");
//
//		}
//
//		//Ekrana 11 12 13 14 yazdirir.
//
//		//C
//		System.out.println(Arrays.toString(arr));
//
//		//Ekrana [11, 12, 13, 14] yazdirir.
//
//		//D
//		System.out.println(arr[arr.length-2]);

		//Ekrana 13 yazdirir.
		
//		
//		System.out.println(arr[1]);
//
//		Ekrana 11 yazdirir.
//
//		OK
		
		
		//2.Soru
		
//		int arr[] = {2, 11, 0, 23, 7};
//
//		//Yukarida verilen Array'in en buyuk elemanini ekrana yazdiran kod asagidakilerden hangisidir?
//
//		//A
//		Arrays.sort(arr);
//
//		System.out.print(arr[arr.length]);
//
//		//B
//		//Arrays.sort();
//
//		System.out.print(arr[arr.length-1]);
//
//		//C
//		Arrays.sort(arr);
//
//		System.out.print(arr[arr.length-1]);
//
//		//D
//		//Array.sort(arr);
//
//		System.out.print(arr[arr.length-1]);
//
//	//	SUBMIT ANSWER
//		Correct Answer:
	//	Arrays.sort(arr);

		//System.out.print(arr[arr.length-1]);

		//3.Soru
//		char arrCh[] = {'a', 'C', 'c', 'A', 'b'};
//
//		Arrays.sort(arrCh);
//
//		System.out.println(Arrays.toString(arrCh));
//
//		//Ekran ciktisi nedir?
//
//		//A
//		//[a, C, c, A, b]
//
//		//B
//		//[A, a, b, C, c]
//
//		//C
//		//[a, b, c, A, C]
//
//		//D
//		//[A, C, a, b, c]
//
//		//SUBMIT ANSWER
//		
//		//Correct Answer:
//			//[A, C, a, b, c]

			//4.Soru
//		int arr[] = {2, 11, 0, 23, 7};
//
//		Arrays.sort(arr);
//
//		for(int i=4; i>=0; i--) {
//
//					System.out.print(arr[i] + " ");
//
//	//	}	
//		
//		//Correct Answer:
//			//[23, 11, 7, 2, 0]

		//5.Soru
//		
//		int arr1[] = {1, 2, 3};
//
//		int arr2[] = {1, 2, 3};

//		Asagidakilerden hangileri ekrana true yazdirir?
//
//		A
//		System.out.println(arr1==arr2);
//
//		B
//		System.out.println(arr1.equals(arr2));
//
//		C
//		System.out.println(Arrays.equals(arr1, arr2));
//
//		D
//     	System.out.println(arr1==arr1);
//
//		SUBMIT ANSWER
//     	Correct Answers:
//     		System.out.println(Arrays.equals(arr1, arr2));
//
//     		System.out.println(arr1==arr1);
//
//     		OK
		
		
		//6.Soru
     	
     	
//     	int arr[] = {1, 23, 12, 2, 3};
//
//     	Yukarida verilen array'de 12'nin eleman olarak var olup olmadigini kontrol etmek icin asagidaki kodlardan hangisi yazilmalidir?
//
//     	A
//     	Arrays.sort(arr);
//
//     	System.out.println(Arrays.binarySearch(arr, 12));
//
//     	B
//     	System.out.println(Arrays.binarySearch(arr, 12));
//
//     	C
//     	System.out.println(Arrays.binarySearch(12));
//
//     	D
//     	Arrays.sort(arr);
//
//     	System.out.println(Arrays.binarySearch(12));
//
//     	SUBMIT ANSWER
//     	Correct Answer:
//     	Arrays.sort(arr);
//
//     	System.out.println(Arrays.binarySearch(arr, 12));
//
//     	OK
//     	
     	//7.Soru
     	
//     	int arr[] = {12, 23, 12, 2, 3};
//
//     	Arrays.sort(arr);
//
//     	System.out.println(Arrays.binarySearch(arr, 12));
//
//     	Ekran ciktisi nedir?
//
//     	A[2, 3]          B  2        C  3     D  Compile Time Error verir.
//
//     	SUBMIT ANSWER
//     	Correct Answer:
//     		2

     	
     	//8.Soru
     	
//     	int arr[] = {12, 23, 12, 2, 3};
//
//     	Arrays.sort(arr);
//
//     	System.out.println(Arrays.binarySearch(arr, 5));
//
//     	Ekran ciktisi nedir?
//
//     	A  Compile Time Error      B  -2      C  ArraysIndexOutOfBoundsException     D  -3
//     	
//     	Correct Answer:
//     		-3
		
     	//9.Soru
     	
//     	
//     	int arr[] = {3, 2, 3, 4, 4, 5,};
//
//     	int count = 0;
//
//     		for(int i=0; i<arr.length; i++) {
//
//     			if(arr[i]==3) {
//
//     				count++;
//
//     			}     }
//
//     	System.out.println(count);
//
//     	Ekran ciktisi nedir?
//
//     	A   2         B  3         C     0       D  1
//     	
//     	Correct Answer:
//     		2
     	
     	
     	
               //10.Soru

     	char arr[] = new char[4];

		arr[0] = 'A';

		arr[2] = 'E';

		arr[3] = 'M';
		System.out.println(Arrays.toString(arr));

//        Ekran ciktisi nedir?
//
//    A  [A, E, M]      B [A, , E, M]   C [A, 0, E, M]   D Copile Time Error
//
//      SUBMIT ANSWER
//      Correct Answer:
//    	  [A, , E, M]

    	 
		
		

	}
}
