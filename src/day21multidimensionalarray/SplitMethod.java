package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str = "Ali Can okula basladi, nasil oldu? Iyi oldu ama zor.";
		
		str.split(" ");                                //Stringi str.split()  parantezin icine yazilan ifadeye göre parcalara ayiracak
		                                               // " " yazilirsa bosluklara göre parcalar 
		                                              //split methodunu kullandigimizda mutlaka bir array olusturmaliyiz
		
		String kelime[] = str.split(" ");             //Parcalari array'in icine yerlestiriyor
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi: "+ kelime.length);  //Bosluklarida  sayar
		
		String str2 = "Kahramanmaraslilar iyi mi?";
		
		String harf[] = str2.split("");
		System.out.println(Arrays.toString(harf));
		
		System.out.println("Harfsayisi: "+harf.length);

	}

}
