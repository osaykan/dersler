package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bugünün tarihini ekrana yazdiralim
		LocalDate.now();
		System.out.println(LocalDate.now());   //2020-05-20
		
		// Bugünün zamanini saat, dakika ,saniye ve salise olarak ekrana yazdiralim
		LocalTime.now();
		
		System.out.println(LocalTime.now());   //16:48:33.202
		
		// Bugünün tarihini ve zamanini ekrana yazdiralim
		LocalDateTime.now();
		System.out.println(LocalDateTime.now());  //2020-05-20T17:02:31.412    araya T yaziyor.Time basliyor anlaminda

		
		
		System.out.println("Bugünün tarihi: "+LocalDate.now());
		System.out.println("Simdiki saat: "+ LocalTime.now());
		System.out.println("Tarih ve Zaman: "+ LocalDateTime.now());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
