package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kücük 3 ün kati olan sayma sayilarini ekrana yan yana yazdiran for loop olust.
		
		for(int i =3; i<100; i+=3){
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		//Ilk 5 sayma sayisinin toplamini veren programi for loop ile yaziniz
		// int sum=0 0+1 herzaman yazmaliyiz
		
		int sum = 0;
		
		for(int i = 1; i<6; i++){
		
			sum = sum+i;
		}
		System.out.println("Toplam: "+sum);//Sadece enson adimi ekranda görmek icin syso yi for loop un disina yazdik
		
  // 10 dan büyük ilk uc sayma sayisinin toplami
		int sum1 = 0;
		
		for(int i=11; i<14; i++){
			sum1 = sum1+i;
			
		}
		System.out.println("Toplam2: " +sum1);
		
		
		//20 den büyük ilk 5 sayisinin toplami
		
		int sum3 = 0;
		
		for(int i = 21;i<=25;i++){
			sum3=sum3+i;
			
		}
		System.out.println("Toplam: "+sum3);
		
		//Ilk 50 sayma sayisinin toplamini veren fot loop olusturunuz
		
		int sum4 = 0;
		for(int i =1; i<51;i++){
			sum4 = sum4+i;
			
		}
		System.out.println("Toplam. "+sum4);
		
		//5 ile bölünebilen 100 den kücük sayma sayilarinin toplamini veren for loop olustur
		int sum5 = 0;
		for(int i =5;i<100;i+=5){
			sum5=sum5+i;
			
		}
		System.out.println(sum5);
	}

}
