package methods2;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi =topla(15,2);
		System.out.println(sayi);
		int toplam = topla2(2,3,4);
		System.out.println(toplam);

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	//topla(int, int)methodu sadece 2 sayı alıyor, istediğimiz kadar deger girebilmek için bu fonksiyon aşağıdaki gibi yazılabilir.
	// variable arguments--> int yanına 3 nokta koyunca istenilen değer kadar sayı argument olarak alınır.
	public static int topla2(int ... number) {
		int toplam=0;
		for (int sayi : number) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer()
	{
		return "Ankara";
	}
}


