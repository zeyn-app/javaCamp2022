package interfaces;

// Birden fazla interface ile implemente edilebilir.
public class MySQLCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("MySQL eklendi.");
		
	}

}
