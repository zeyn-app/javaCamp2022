package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			// System.out.println(number);
			if (max < number) {
				max = number;
			}
			total += number;
		}
		System.out.println("Toplaam: " + total);
		System.out.println("En büyük sayı: "+ max);
	}
}
