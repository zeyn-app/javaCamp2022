package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		/*
		 * //Bu şekilde kullanılamaz. 
		 * BaseGameCalculator baseGameCalculator = new baseGameCalculator();
		 */
		
		//Bu şekilde yeni nesneler elde edilebilir.
		BaseGameCalculator[] baseGameCalculators = new BaseGameCalculator[] {new ManGameCalculator(), new WomanGameCalculator()};
		BaseGameCalculator baseGameCalculator = new ManGameCalculator();
	}
}
