
public class TestAClass 
{
	public static boolean UniverseIsInOrder = true;
	public static boolean RyanIsAwsome = false;
	
	public static boolean theWorldWontEnd()
	{
		if (UniverseIsInOrder) 
		{
			RyanIsAwsome = true;
		}
		while (RyanIsAwsome)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		if (theWorldWontEnd()) 
		{
			System.out.println("The world is safe!");
		} 
		else
		{
			System.out.println("It's the end of the world!");
		}
	}
}
