
public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()}; 
		
		for(BaseLogger logger:loggers){
			logger.Log("Log Mesajı");
		}
	}*/
		// Constuctor'da parametre olarak BaseLogger nesnesi alınsa da aşağıdaki kod satırında EmailLogger sınıfının nesnesi parametre olarak alınmıştır. Polimorfik yapıdan kaynaklanmaktadır.                                  
	CustomerManager customerManager = new CustomerManager(new FileLogger());
	customerManager.add();

	}
}
