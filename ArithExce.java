import java.util.*;
class ArithExce
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		try
		{
			int x=a/b;
			System.out.println("output: "+x);
		}
		catch(Exception ex)
		{
			System.out.println("Division by zero error");
			System.out.println("change b value");
		}
	}

}
