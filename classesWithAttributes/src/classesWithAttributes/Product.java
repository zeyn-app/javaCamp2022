package classesWithAttributes;

//Bu sınıfta ürüne ait bilgiler verilmiştir.
public class Product {
	// Bu class kullanılmak istenirse, çağrıldığı yerde new in yanında parametreler de verilmelidir.
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Constructor çalıştı.");
		this.id=id;
		this.name=name;
		this.description =description;
		this.price=price;
		this.stockAmount = stockAmount;
		this.renk=renk;
	}
	
	//Yapıcı fonksiyon overload edldi.
	public Product()
	{
		
	}
	
	// attribute: field
	// best_practice fild'ların başına _koy, ama bu editörde bu şekilde kullanmadım.
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return name.substring(0,2) + id;
	}
	//kodun yazılabilir olmasını engellemek için setKod metotu yazılmaz.
	/*
	 * public void setKod(String kod) { this.kod = kod; }
	 */	 
}
