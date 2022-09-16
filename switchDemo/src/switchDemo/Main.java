package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'a';

		switch (grade) {
		// İki farklı girdi için aynı notu vermek için case' ler alt alta bu şekilde yazılabilir.
		case 'A':
		case 'a':
			System.out.println("Mükemmel : Geçtiniz.");
			break;

		case 'B':
		case 'b':
			System.out.println("Çok güzel : Geçtiniz.");
			break;

		case 'C':
		case 'c':
			System.out.println("İyi : Geçtiniz.");
			break;

		case 'D':
		case 'd':
			System.out.println("Fena değil : Geçtiniz.");
			break;
		case 'F':
		case 'f':
			System.out.println("Maalesef Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}
	}

}
