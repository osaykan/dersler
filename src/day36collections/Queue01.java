package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
	
		//Queue(kuyruk): Queue'ya eklenen elemanlar en sona eklenir, listlerde oldugu gibi.
		//               Queue'da girilen elemanlar en bastan silinir.
		//               [1,2,3]==> Bu Queue'dan eleman silmeye basladiginizda once 1 silinir.
		//               FIFO==> First In First Out(Eski ekmegin önce tüketilmesi gibi)
		
	
		//PriorityQueue elemanlari natural order'a göre siralar
		Queue<String> q = new PriorityQueue<>();//Queue nin cocugo PriorityQueue
		q.add("B");
		q.add("A");
		q.add("C");
	System.out.println(q);//[A, B, C]
	System.out.println("Silinen eleman: "+q.remove());//Silinen eleman: A ==> A yi sildim.Herzaman ilk elemani siler.
	System.out.println("Kalan queue: "+q);//Kalan queue: [B, C]
	System.out.println(q.remove("C")); //true cünkü biz Javaya hangi elemani silmesi gerektigini söyledik islem tamam.
	System.out.println(q);//[B]

	
	
	//LinkedList giris sirasina göre yazdirir.
	Queue<String> qll =new LinkedList<>();  //Queue data type ama interface, LinkeddList Class object üretildi
     qll.add("B");
	qll.add("A");
	qll.add("C");
	System.out.println(qll);//[B, A, C]
	System.out.println(qll.element());//B  ilk elemani dondurur.
	System.out.println(qll.poll());//B Ilk elemani sildi
	System.out.println(qll);  //[A, C]
	
	System.out.println(qll.poll());//A
	System.out.println(qll);//[C]
	
	System.out.println(qll.poll());//C
	System.out.println(qll);	//[]
	
	System.out.println(qll.poll());//null
	System.out.println(qll);  //[]
	
	
	
	//Not: remove() methodu bos queue'lar icin kullanilirsa Exception verir.
	//     poll() methodu bos queue'lar icin kullanilirsa null verir.
	//     Ama dolu queue'lar icin ayni isi yaparlar, farklari yoktur

	}

}
