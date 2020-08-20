package day23date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date02 {

	public static void main(String[] args) {
		//Date Manipulation (Date üzerinde degisiklikler yapmak)
		
		LocalDate date = LocalDate.now();     //Önce date object  olusturuyoruz
		System.out.println(date);   //2020-05-20
		date.plusDays(1);  //date su anin tarihi 1 ekledik
		System.out.println(date.plusDays(1));    //2020-05-21

		System.out.println(date.plusDays(15));   //2020-06-04
		
		System.out.println(date.plusDays(-1));   //2020-05-19   bu cok kullanilmaz baska method var
		
		
		System.out.println(date.plusMonths(2));   //2020-07-20
		System.out.println(date.plusYears(2));   //2022-07-20
		System.out.println(date.plusWeeks(2));    //2020-06-03
		
		
		System.out.println(date.minusDays(3));  //2020-05-17 3 gun oncesi
		System.out.println(date.minusWeeks(1)); //2020-05-13
		System.out.println(date.minusMonths(2));  //2020-03-20
		
		
		
		
		
		
		 LocalDate tdt = LocalDate.now();
		 System.out.println(""+LocalTime.now());
		 System.out.println("Güne 17 eklendi:          "+tdt.plusDays(17));
		 System.out.println("Aya 10 eklendi:           "+tdt.plusMonths(11));
		 System.out.println("Yil'a 40 eklendi:         "+tdt.plusYears(40));
		 
		 System.out.println("Günden 10 cikarildi:      "+tdt.minusDays(10));
		 System.out.println("Haftadan 20 cikarildi:    "+ tdt.minusWeeks(20));
		 
		 LocalTime lct = LocalTime.now();
		 System.out.println("Saate 8 eklendi:          "+lct.plusHours(8));
		 System.out.println("Dakikaya 55 eklendi:      "+lct.plusMinutes(55));
		 
		 System.out.println("Saniyeden 25 cikarildi:   "+lct.minusSeconds(25));
		 System.out.println(LocalTime.now());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
