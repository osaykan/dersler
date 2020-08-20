package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While==> iken demektir
		//While I go to school==> Ben okula giderken
		//While I go to Uskudar, it rained

		
		int num = 0;
		//num 4 den kücük iken
		while(num<4){
          	
			System.out.println("Ali");
		   num++;                     //Bu satiri unutursaniz sonsuz döngüye gire.   Unutmaaaaaaaaaaaa
			
		}
		
		//While loop kullanarak 1 den 10 kadar tamsayilari ekrana yazdiriniz
		
		int num1 =1;
		while (num1<11){
			System.out.print(num1+" ");
			num1++;
			
		}
		//while loop kullanarak 1 den 20 ye kadar cift sayilari
		System.out.println();
		
		int num3=1;
		while(num3<21){
			if(num3%2==0){
				System.out.print(num3+" " );
				}
			
			num3++;
		}
		System.out.println();
		
		//while kullanarak 5 den 120 ye kadar 3 ile bölunen
		
		int num4 = 5;
		while(num4<121){
			if(num4%3==0){
				System.out.print(num4+" ");
			}
			num4++;
		}
		
		
		
		
		
	}

}
