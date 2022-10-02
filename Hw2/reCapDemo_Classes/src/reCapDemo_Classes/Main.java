package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(2,3);
		System.out.println(sonuc);
		sonuc = dortIslem.Cikar(8, 7);
		System.out.println(sonuc);
		sonuc = dortIslem.Carp(9, 4);
		System.out.println(sonuc);
		sonuc = dortIslem.Bol(15, 3);
		System.out.println(sonuc);
	}

}
