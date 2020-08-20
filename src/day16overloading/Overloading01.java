package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
	/*
	 * Iki sayinin toplamini ekrana yazdiran bir method olusturunuz.
	 */
		
        toplama(5,10);    //üstteki methodu kullanir cift parametre var   met 1                                        1
        toplama(7);       //alttaki methodu kullanir tek parametre var.   met 2                                        2
        toplama(2.3,4);   //double oldugu icin 3. methodu kullanir        met 3                                        3
        toplama(5,4.1);     //                                              met 4
	}
	//Methodun body kismini degistirmek yeterli olmadi
	          //Overloading yapma yollari
	//1)Parametrelerin sayisini degistirerek ayni isimli methodlar olusturulabilir
	//2)Parametre sayisini degistirmeden herhangi bir parametrenin data type ini degistirerek de ayni isimli methodlar olusturulabilir
	//Note: 1 cagrisi 1.method var oldugu sürece onu kullanir,argüment data type birebir örtüsüyor.
	//        Örtüsen yoksa auto wideninge göre kullanacagi methodu secer.Kullanacagi method yoksa hata verir
	//3) FARKLI data type'indeki parametrelerin yerleri degistirilerek de ayni isimli methodlar olusturabilirsiniz.
	
	//Method 1
	public static void toplama(int num1,int num2){
	System.out.println(num1+num2);
		
	}
	
	//public static void toplama(int num3,int num4){           int ve adet ayni problem olur
//	System.out.println(num1+num2);
//		
//	}
	//Method2
	public static void toplama(int num1){
		System.out.println(num1+num1);
			
		}
    //Method 3
	public static void toplama(double num1,int num2){
	System.out.println(num1+num2);
		
	}
	//Method 4
	public static void toplama(int num1,double num2){
		System.out.println(num1+num2);
			
		}
}
