package day26encapsulation;
//Inheritance01, Inheritance02'nin parenti olacak
//"extends" den sonraki  parent,önceki child olur

public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {
		// Child'in birden fazla parenti olurmu?
		//Cevap: Olmaz. Java "multiple inheritance" i desteklemez
		//       Java "Single Inheritance" i destekler
		
		//Parentin birden fazla Childi olurmu?
		//Cevap: Olur."Hiyerarsik Inheritance" denir
		
		// child[a,b]--> parent[c,d,e]--> grandParent[f,g]
		//Child nelere sahip? a,b,c,d,e,f,g
		//Parent nelere sahip? c,d,e,f,g
		//grandParent nelere sahip? f,g

	}

}
