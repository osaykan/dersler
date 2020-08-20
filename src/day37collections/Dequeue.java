package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque: Double Ended Queue (Iki uclu Queue)
		//Queue'lerde ekleme sona yapilir, silme bastan yapilir.
		//Deque kullanirsaniz ekleme ve silmeyi hem bas hemde sonda yapilabilir.
		//Deque da FIFO var bunun yaninda LIFO(Last In First Out) da var
		//Deque resizable'dir. Yani kapasitesi degistirilebilir
		
		//Queue'lara eleman olarak null eklenebilir, ama Deque'lara null eleman olarak eklenemez
		
		Deque<String> dq = new LinkedList<>();  //LinkedList  Deque nin childi degil ama buna ozel ayarlanmis.
		dq.add("Son 1");
		dq.addFirst("bas 1");
		System.out.println(dq);     //[bas 1,Son 1]  addFirs kullandigimiz icin basa ekledi
		
		dq.addLast("Son2");
		System.out.println(dq);    //[bas 1, Son 1, Son2]
		dq.push("Bas2");  //en basa ekleme yapar
       System.out.println(dq);   //[Bas2, bas 1, Son 1, Son2]
       dq.offer("Son3");
       System.out.println(dq);   //[Bas2, bas 1, Son 1, Son2, Son3]
       dq.offerFirst("Bas3");
       System.out.println(dq);    //[Bas3, Bas2, bas 1, Son 1, Son2, Son3]
       
       
       //pop() methodu Deque'lerde bastaki elemani siler ve bastaki elemani return eder.
       
       System.out.println(dq.pop());   //Bas3   sildigi eleman
       System.out.println(dq);          //[Bas2, bas 1, Son 1, Son2, Son3]
       
       System.out.println(dq.removeLast());//Son3
       System.out.println(dq);             //[Bas2, bas 1, Son 1, Son2]
       
       System.out.println(dq.removeFirst());  //Bas2
       System.out.println(dq);               //[bas 1, Son 1, Son2]
       
             
       
	}

}
