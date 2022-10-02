package conditionals;

public class Main {

	public static void main(String[] args) {

		int sayi = 200;
		// Şart blokları oluşturulan algoritmanın şartlarının yerine getirilmesini sağlar.
		if(sayi<20)
		{
			System.out.println("Sayi 20'den küçüktür.");
		}
		else if(sayi == 20) {
			System.out.println("Sayi 20'ye eşittir.");
		}
		else {
			System.out.println("Sayi 20'den büyüktür.");
		}
	}

}
