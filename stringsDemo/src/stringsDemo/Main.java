package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel. ";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı: " + mesaj.length());
		 * System.out.println("5.eleman: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("Yaşasın!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler);
		 */
		
		System.out.println(mesaj.replace(' ', '-'));
		// İlgili metni 4.karakterden itibaren kesmeye yarıyor.
		System.out.println(mesaj.substring(4));
		// Metnin tamammını değil bir yere kadar kesmek için başlangıç indeksi ve son indekx belirtilmelidir. 
		System.out.println(mesaj.substring(2,8));
		//Metindeki kelimleri tek tek bastırmak için split fonksiyonu kullanılır.
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		// Kelimelerin tüm harflerini büyük-küçük harfe çevirmek için tolowercase, touppercase fonksiyonları kullanılır.
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		// Başındaki ve sonundaki boşlukları atmak için trim fonksiyonu kullanılır.
		System.out.println(mesaj.trim());
		System.out.println(mesaj);
	}

}
