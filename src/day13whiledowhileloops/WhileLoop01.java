package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		//Task:While loop kullanarak ilk 5 sayma sayisinin toplamini ekrana yazdir
		int sum =0;
		int num =1;
		while(num<=5){
			sum =sum+num;
			num++;
		}System.out.println(sum);

	}

}
