package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop_2", "Asus Laptop", 3000, 2, "Siyah");
		product.setName("Laptop");
		product.setId(2);
		product.setDescription("Asus Laptop");
		product.setPrice(5600);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}
}
