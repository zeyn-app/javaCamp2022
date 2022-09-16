package variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Burada öğrenci sayısı birden fazla yerde kullanılıyor, öğrenci sayısının değiştiği durumlarda her yerde bu değiişikliğin yapılması gerekiyor bu da uzun ve hataya açık bir işlem olacaktır.
		// Bu durumun önüne geçmek için bir değişken tanımlanmalıdır.
		System.out.println("Öğrenci sayım: 9");
		System.out.println("Öğrenci sayım: 9");
		System.out.println("Öğrenci sayım: 9");
		System.out.println("Öğrenci sayım: 9");

		// int = integer yani tamsayı
		// Değişkenler tanımlanırken camelCasing denilen yöntem ile tanımlanmalıdır. İlk kelimenin ilk harfi küçük, sonraki kelimelerin ilk harfi büyük olmalıdır.
		int ogrenciSayisi = 10;
		System.out.println("Öğrenci sayım: " + ogrenciSayisi);
		System.out.println("Öğrenci sayım: " + ogrenciSayisi);
		System.out.println("Öğrenci sayım: " + ogrenciSayisi);
		System.out.println("Öğrenci sayım: " + ogrenciSayisi);
		// Burada matematiksel bir işlem gerçekleşmiyor, metinsel ifadelerde toplama işlemi uygulanıyor yani yan yana yazılıyor. 
		// Bu metinsel ifade de bir değişken olarak yazılabilir.
		
		String mesaj = "Öğrenci sayısı: ";
		System.out.println(mesaj+ogrenciSayisi);
	}

}
