package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();  //obje olusturduk ama new yazmadik yazilsada olur ama iyi degil
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		dtf.format(date);
		System.out.println(dtf.format(date));         //20-Mai-2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf1.format(date));        //20-05-2020
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf2.format(date));      //2020/5/20
		
		
		//Time formatini degistirmek
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");  //HH kullanirsaniz 24 lük dilimi alirsiniz
		System.out.println(dtf3.format(time));     //06:02
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(dtf4.format(time));   //06:04:00

		//Baska ülkenin local zamanini almak ?
		
		System.out.println(time.now(ZoneId.of("Europe/Berlin")));
		
		
		
		
		LocalDate tarih = LocalDate.now();
		DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		System.out.println("Yeni Format:   "+tarih.format(dtfm));
		
		LocalTime zaman = LocalTime.now();
		DateTimeFormatter zmn =  DateTimeFormatter.ofPattern("hh:mm");
		System.out.println("Yeni time format:  "+zmn.format(zaman));
		
		
		LocalDateTime tarihZaman = LocalDateTime.now();
		DateTimeFormatter trZ = DateTimeFormatter.ofPattern("yyyy/MMM/dd & HH:mm");
		System.out.println(trZ.format(tarihZaman));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
