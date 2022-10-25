package overriding;

public class BaseKrediManager {
	// final keywordü ile bu fonksiyonun override edilmesinin önüne geçilir.
	public final double hesapla(double tutar) {
		
		return tutar*1.18;
	}

}
