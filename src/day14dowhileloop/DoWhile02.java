package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		// do -while ile while looplarinin farki..

		int num1 = 7;
		while(num1<7){
			System.out.println("While: "+num1); //calismaz
			num1++;
		}
		
		int num2 = 7;
		do{
			System.out.println("Do while: "+num2);//bir kere calistiri sonra sarta bakar
		}while(num2<7);
	}

}
