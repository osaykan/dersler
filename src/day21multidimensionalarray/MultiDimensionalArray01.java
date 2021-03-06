package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// Multi Dimensional Array Olusturma(2 boyutlu olusturma)

		int arr[][] = new int[3][4]; // ilk en distaki eleman sayisi, ikinci si
										// icteki arrayin eleman sayisi
										// {arr1,arr2,arr3} ar1{1,2,3,4},
										// arr2{5,6,7,8} arr3{0,1,9,5} gibi
		System.out.println(Arrays.toString(arr));// [[I@15db9742, [I@6d06d69c,
													// [I@7852e922]
		System.out.println(Arrays.toString(arr[1]));// icteki ikinci arrayin
													// elemanlarini verir [0, 0,
													// 0, 0]

		System.out.println(Arrays.deepToString(arr));// B?t?n elemanlari verir

		// Atama yapalim 1.Yol
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;

		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;

		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3, 4], [5, 6,
														// 7, 8], [9, 10, 11,
														// 12]]
		System.out.println(arr[1][2]); // 7
		System.out.println(arr[0][3] + arr[2][1]);// 4+10
	}

}
