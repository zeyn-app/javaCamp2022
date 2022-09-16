package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'ğ';
		
		switch(harf) {
		case 'A':
		case 'a': 
		case 'I': 
		case 'ı': 
		case 'O': 
		case 'o': 
		case 'U': 
		case 'u': 
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
			
		case 'E':
		case 'e':
		case 'İ':
		case 'i':
		case 'Ö':
		case 'ö':
		case 'Ü':
		case 'ü':
			System.out.println(harf + " ince sesli bir harftir.");
			break;
			
			default:
				System.out.println("Lütfen sesli bir harf giriniz.");
			
		}

	}

}
