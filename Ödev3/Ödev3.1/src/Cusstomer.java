public class Cusstomer {

	// Bu class ta sadece Customer' a ait özellikler bulunmaktadır. Metodlar başka bir sınıfta bulunmaktadır. 
	public int Id;
	// NationalIdentity sadece person a ait bir özellik olduğu için o sınıfta yazılmalıdır.
	//public String firstName;
	//public String lastName;
	// public String NationalIdentity;
	public String city;
	
	//Burada bahsedilen müşteriler sadece gerçek kişiler olmayabilir, tüzel kişiler de olabilir.
	//Dolayısıyla bu sınıfın inheritance ta base sınıf olarak kullanılması için sadece tüzel ve gerçek kişilerde ortak olan özellikleri içermelidir.
	// public String TaxtNumber;
		
	
	// Constructor
	public Cusstomer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
	public int getId() { 
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
