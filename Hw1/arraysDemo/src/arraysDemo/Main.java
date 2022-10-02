package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 ="Ahmet";
		String ogrenci4 ="Salih";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------");
		//Yukardaki gibi tek tek yazmak yerine bir for döngüsünde tüm öğrenciler listelenebilir.
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for( int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		// Genelde bu yöntem kullanılır. İndex kullanmadan daha okunur bir kod yazılabilir bu yöntemle.
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
