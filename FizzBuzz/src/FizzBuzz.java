public class FizzBuzz 
{
	public static void count()
	{
		for (int i = 1; i <= 20; i++)
		{
			String FizzBuzz = "";
			if (i % 3 == 0) 
			{
				FizzBuzz += "Fizz";
			}
			if (i % 5 == 0) 
			{
				FizzBuzz += "Buzz";
			}
			if (FizzBuzz != "") 
			{
				System.out.println(FizzBuzz);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		count();
	}
}
