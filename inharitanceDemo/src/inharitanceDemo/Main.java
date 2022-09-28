package inharitanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		//Burada OgretmenKrediManager a ait bir nesne oluşturuldu ve parametre olarak o nesne gönderildi.
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//polimorfizim
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
