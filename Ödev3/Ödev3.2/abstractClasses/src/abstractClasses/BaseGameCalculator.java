package abstractClasses;

public abstract class BaseGameCalculator {
	// Bu fonskyonu miras alan tüm sınıflar override etmelidir.
	public abstract void hesapla();
	
	//Burada final keyword ü kullanıldığı için override edilemez.
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}

}
