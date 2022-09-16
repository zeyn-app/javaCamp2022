package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for döngüsünde index değeri 0 dan başlayıp, 10 küçük olduğu sürece birer
		// birer arttırılmıştır.
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");

		// while döngüsü
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");

		// do-while döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While döngüsü bitti.");
	}

}
