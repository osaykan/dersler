package day06Ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {

		//Birtane String variable olusturun , ve g�n ismini k�c�k harflerle bir deger atayin. Eger deger hafta ici g�nlerinden birinin ilk harfi ise ekrana hici yazdirin
		
		String g�n = "persembe";
		
		if(g�n.equals("pazartesi")||g�n.equals("sali")||g�n.equals("carsamba")||g�n.equals("persembe")||g�n.equals("cuma")){
			System.out.println("Hafta ici");
		}
		if(g�n.equals("cumartesi")||g�n.equals("pazar")){
			System.out.println("Hafta sonu");
		}

	}

}
