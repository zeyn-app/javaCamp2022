package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapıcı fonksiyon çalıştı.");
	}
	
	//Bu fonksiyon static yapılarak tek bir nesne yaratılır ve tüm sınıflardan bu fonksiyona bu nesne ile erişim sağlanır.
	public static boolean isValid(Product product) {
		
		if(product.price>0&&product.name.isEmpty()==false) {
			return true;
		}
		return false;
	}
	
	// bu fonksiyonu çağırmak için ilgili class new lenmelidir.
	public void deneme() {
	}
	
	// Inner class
	public static class DenemeClass{
		public static void sil() {
			
		}
	}
}