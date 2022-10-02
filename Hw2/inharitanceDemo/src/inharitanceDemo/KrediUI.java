package inharitanceDemo;
// Bir arayüz sııfı olarak düşünülebilir.
public class KrediUI {
	// Burada parametre olarak baseKrediManager nesnesi alınır, dolayısıyla bu fonksiyon çağrıldığı zaman OgretmenKrediManager veya TarimKrediManager nesneleri parametre olarak kullanılabilir.
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}

}
