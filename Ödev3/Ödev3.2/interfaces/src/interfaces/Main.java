package interfaces;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * // Bu şekilde nesne oluşturamazlar. ICustomerDal iCustomerDal = new
		 * ICustomerDal();
		 */
		
		/*
		 * ICustomerDal iCustomerDal = new OracleCustomerDal();
		 * 
		 * iCustomerDal.Add();
		 */
		ICustomerDal iCustomerDal = new MySQLCustomerDal();
		CustomerManager customerManager = new CustomerManager(iCustomerDal);
		customerManager.add();
	}

}
