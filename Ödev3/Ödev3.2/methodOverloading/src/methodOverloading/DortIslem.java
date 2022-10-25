package methodOverloading;

public class DortIslem {
	//Iki adet sayıyı toplayan fonksiyon
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}

	//Uc adet sayıyı toplayan fonksiyon, üstteki fonksiyon overload edildi.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
}
