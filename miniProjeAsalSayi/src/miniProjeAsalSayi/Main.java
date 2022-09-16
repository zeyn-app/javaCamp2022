package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=1;
		int flag=0;
		
		for(int i = 2; i<=sayi/2;i++ ) {
			if(sayi%i==0)flag=1;
		}
		
		if(flag==0 && sayi!=1)
		{
			System.out.println(sayi + " sayısı asal sayıdır.");
		}
		else {
			System.out.println(sayi + " sayısı asal sayı değildir.");
		}

	}

}
