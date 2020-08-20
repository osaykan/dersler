package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// For Each Loop , for loop'un üst versiyonudur. Diger adi "Enhanced(Zenginlestirilmis) for loop"
		

		int arr[]={12,21,13,43};
		
		//for loop kullanarak
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			
		}
		System.out.println("==");
		//for each kullanarak
		for(int w:arr){
			System.out.println(w);
		}
		//String iceren bir array olusturun ,elemanlarini yanyana aralarina bosluk koyarak for each loop ile yazdirin
		
		String arr1[]= {"Ali","Veli","Numan"};
		
		for(String w:arr1){
			System.out.print(w+" ");
			
		}
		//Integer elemanlar iceren bit List olusturun :For each loop kullanarak bu elemanlarin toplamini yazdirin
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(8);
		
		int sum=0;
		
		for(int w:list){
			sum=sum+w;
			
		}System.out.println(sum);
		
		//{ {1,2},{5},{6,7,8} } arrayindaki tüm elemanlarin toplamini bulalim
		
		int arr2[][]= {{1,2},{5},{6,7,8}};
		int sum1=0;
		
		for(int[] w :arr2){
			
			for(int z : w){
				sum1=sum1+z;
				
			}
		}
		System.out.println(sum1);
		
		
		
	}

}
