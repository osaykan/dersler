package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
	
		Constructors04 obj1 = new Constructors04();
		System.out.println((obj1.num1));//12
		System.out.println(obj1.num2);//22  num2 static oldugundan obje kullanarak cagirmami java istemiyor
		System.out.println(Constructors04.num2);  // 22   Class ismi ile cagirmamizi Java güzel karsiladi
		

	}

}
