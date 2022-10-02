package classes;

public class ValueAndReferenceType {
	// Bu method ile değer ve referans tiplerinin ne olduğu açıklanmıştır.
	public void valueAndReferenceType()
	{
		// value; en son hangi değere eşitlendiyse o değeri alır.
		int sayi1 = 10;
		int sayi2 = 20;		
		sayi2=sayi1; // sayi1 =10, sayi2 = 10
		sayi1=30;	 // sayi1 =30, sayi2 = 10
		System.out.println(sayi2);
		
		// referans; pointer gibi düşünülebilir. Bir adrese point ediyor, içindeki değer değişse de adres aynı kalacağı için yeni değeri bastırır.
		int[] sayilar1 = new int [] {1,2,3}; // adressOf1 = 101
		int[] sayilar2 = new int [] {4,5,6}; // adressOf2 = 102
		sayilar2 = sayilar1; 				 // adressOf2 = adressOf1 = 101, yani sayilar1=sayilar2 = {1,2,3}
		sayilar1[0] = 10;                    // sayilar1 = sayilar2 = {10,2,3}
		System.out.println(sayilar2[0]);
	
	}
	
	

}
