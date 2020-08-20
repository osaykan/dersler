package day06Ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {

		//Birtane String variable olusturun , ve gün ismini kücük harflerle bir deger atayin. Eger deger hafta ici günlerinden birinin ilk harfi ise ekrana hici yazdirin
		
		String gün = "persembe";
		
		if(gün.equals("pazartesi")||gün.equals("sali")||gün.equals("carsamba")||gün.equals("persembe")||gün.equals("cuma")){
			System.out.println("Hafta ici");
		}
		if(gün.equals("cumartesi")||gün.equals("pazar")){
			System.out.println("Hafta sonu");
		}

	}

}
