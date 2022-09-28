package inheritance;

public class Main {

	public static void main(String[] args) {
		// Person class ında olan tüm metotlar ve bu sınıflarda özel olarak tanımlanmış metotların hepsi gelir.
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		// PersonManager sınıfına ait tüm operasyonlar ve her bir sınıf için ayrı ayrı özel olarak tanımlanmış metotlar gelir. 
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	}

}
