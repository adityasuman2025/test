import java.util.Scanner;

public class Pattern
{
	public static void main(String [] args)
	{
	
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of pattern");
		a = s.nextInt();
		System.out.println("you have entered " + a);
		
		for(int i =a; i>0; i--)
		{
			for(int k =0; k<a+1-i; k++)
			{
				System.out.print("*");			
			}
			
			System.out.println(" ");
		}
	}
}
