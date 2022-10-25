
public class Main {

	public static void main(String[] args) {
		
		// new lenmeden önce nesne stack'te tutuluyordu, new kullanıldığı gibi heapte bir referans oluşacaktır.
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Cusstomer customer = new Cusstomer();
		customer.Id=1;
		//customer.firstName="Engin";
		//customer.lastName="Demiroğ";
		//customer.nationalIdentity="123456";
		customer.city="Ankara";
		 
		/*CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();*/
		
		Company company = new Company();
		company.TaxtNumber = "4563214589";
		company.companyName = "Arçelik";
		company.Id = 100;
		
		//CustomerManager cM2 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.firstName="Ali";
		

		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Cusstomer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	}

}


