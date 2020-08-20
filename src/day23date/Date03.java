package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipulation(Zamani degistirecegiz)
		//Önce Obje olusturacagiz
		
		LocalTime time = LocalTime.now();
		System.out.println(time);                  //17:31:09.008
		System.out.println(time.plusHours(3));    //20:31:09.008
		System.out.println(time.plusMinutes(30));  //18:01:09.008
		System.out.println(time.plusSeconds(25));  //17:31:34.008
		
		System.out.println(time.minusHours(8));    //09:31:09.008
		System.out.println(time.minusMinutes(50));  //16:41:09.008
		System.out.println(time.minusSeconds(40));  //17:30:29.008
		System.out.println(time.minusMinutes(500));  //09:13:55.975

		LocalTime time1 = LocalTime.now();//simdiki yazdik islemleri kiyaslamak icin
		System.out.println(time1);     
	}

}
