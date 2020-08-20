package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
	
		//// A harfini bulunca “Ilk harf”, B harfini bulunca “Ikinci harf”
		// C harfini bulunca “Ucuncu harf”, D harfini bulunca “Dorduncu harf”
		// yazdiran programi if else if() ve switch() kullanarak yaziniz.
		// digerleri icin “Bilmiyorum”

		char harf = 'Z';
		
		// 1.Yol ==> if else if
		
//		if(harf=='A'){
//			
//			System.out.println("Ilk Harf");
//		}else if(harf=='B'){
//			System.out.println("Ikinci Harf");
//			
//		}else if(harf=='C'){
//			System.out.println("Ücüncü Harf");
//		}else if(harf=='D'){
//			System.out.println("Dördüncü Harf");
//		}else{
//			System.out.println("Bilmiyorum");
//		}
		
		
		// 2.Yol ==> switch()
		switch(harf)  {
		   case 'A' :
			   System.out.println("Ilk Harf");
		        break;
		  
		   case 'B' :
			   System.out.println("Ikinci Harf");
			   break;
			   
		   case 'C' :
			   System.out.println("Ücüncü Harf");
			   break;
		   case 'D' :
			   System.out.println("Dördüncü Harf");
			   break;
			default:
				System.out.println("Bilmiyorum");
			   
			   
		}
		
		
		
	}

}
