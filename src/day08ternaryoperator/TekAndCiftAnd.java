package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4);// && 2 tane varsa bir tane false bulunca digerlerini kontrol etmez. 
		System.out.println(3<2 && 5>4 && 6>4 && 1>4); //Süre kazandirir ve Javanin hata yapma riski azalir
		
        System.out.println(3<2 & 5>4);// & 1 tane varsa hepsini kontrol eder. Vakit alir. Yükü artirir.
        
        
	}

}
