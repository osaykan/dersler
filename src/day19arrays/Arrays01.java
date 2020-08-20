package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Integer Array olusturalim

		int arr1[]= new int[5];//0 0 0 0 0 degerini atar
		System.out.println(arr1);//[I@15db9742 böyle bir sey verdi . Bu adres.Arrayler heap memory de.
		//char array olusturalim
		char arr2[] = new char[4];
		System.out.println(arr1);//ayni adresi veriyor
		System.out.println(arr1[0]);//ilk sifir indexi sifir olan elemenini yani ilk elemani yazdirir.
		System.out.println(arr1[3]);// dördüncü sifiri aliriz.indexi 3 olan yani dördüncü elemani verir
		
		
		arr1[0]= 12;//index i sifir olana 12 ata
		System.out.println(arr1[0]);
		
		arr1[4] = 22;
		System.out.println(arr1[4]);
		
		arr1[1] = 5;
		arr1[2] = 7;
		arr1[3] = 9;
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		//Array'deki elemanlari ekrana yazdirmak icin for döngüsü kullaniniz
		
		for(int i = 0; i<5;i++){
			System.out.println(arr1[i]);
		}
		//Arrayde olmayan indexe deger atamasi yapilirsa Run Time eror alinir
		//Array de olmayan indexi kullanmaya calisirsak "ArrayIndexOutOfBoundsException" aliriz.Bound=sinir.(Arrayin indexinin sinirinin disinda hatasi)
		arr1[5]= 23;  
	
		System.out.println(arr1[5]);     // java.lang.ArrayIndexOutOfBoundsException
	}

}
