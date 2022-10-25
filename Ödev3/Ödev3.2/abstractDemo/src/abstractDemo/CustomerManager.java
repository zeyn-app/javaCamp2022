package abstractDemo;

public class CustomerManager {
	
	/*private BaseDataBaseManager dataBaseManager;*/
	BaseDataBaseManager dataBaseManager;

	void getCustomers(/*BaseDataBaseManager dataBaseManager*/) {
		
		/*
		 * //Bu şekilde tanımlanırsa oracle a bağımlı hale gelinir.
		 * OracleDataBaseManager oracleDataBaseManager = new OracleDataBaseManager();
		 * oracleDataBaseManager.getData();
		 */
		
		/*this.dataBaseManager = dataBaseManager;*/
		dataBaseManager.getData();
	}
}
