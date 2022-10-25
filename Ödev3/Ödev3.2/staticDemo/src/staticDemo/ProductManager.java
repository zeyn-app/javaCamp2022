package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//static fonksiyon için nesne yaratılmasına gerek yoktur.
		//ProductValidator productValidator = new ProductValidator(); 
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersiz.");
		}
		
	}
}
