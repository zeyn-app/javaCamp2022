
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
		public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int i : sayilar) {
			if(i==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi==true) {
			System.out.println("Aranan sayı dizide bulunmaktadır." + aranacak);
		}else {
			System.out.println("Aranan sayı dizide bulunmamaktadır." + aranacak);
		}
	}

}
