package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// Ilk 4 sayma sayisinin carpimini veren for loop olusturunuz
		
		int product = 1;
		
		for(int i =1;i<5;i++){
			product = product*i;
			
		}
         System.out.println("Product: " +product);
         
         //Ilk 6 cift sayma sayisinin carpimini verev 
         
         int product1 = 1;
         
         for(int i =2;i<13;i = i+2){
        	 product1=product1*i;
         }
         System.out.println(product1);
         
        //9! i hesapla
         
         long product3 = 1;
         
         for(long i = 1;i<10;i++){
        	 product3 =product3*i;
        	 
         }
         System.out.println("9!= "+product3);
	}

}
