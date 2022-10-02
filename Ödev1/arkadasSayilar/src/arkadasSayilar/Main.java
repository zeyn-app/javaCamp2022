package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1=220;
		int number2=284;
		int totalNumber1=0;
		int totalNumber2=0;
		
		
		for(int i=1; i<=number1/2;i++)
		{
			if(number1%i==0)
				totalNumber1 +=i; 
		}
		
		for(int i=1; i<=number2/2;i++)
		{
			if(number2%i==0)
				totalNumber2 +=i; 
		}
		
		if(number1==totalNumber2 && number2==totalNumber1)
		{
			System.out.println(number1 + " and "+ number2 +" are friend numbers");
		}
		else
		{
			System.out.println(number1 + " and "+ number2 +" are not friend numbers");
		}

	}

}
