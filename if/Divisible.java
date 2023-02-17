import java.util.Scanner;
public class Divisible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println(number+" "+"is Divisible by 2");
		}
		if(number%2!=0)
		{
			System.out.println(number+" "+"is NOT Divisible by 2");
		}
		
	}
	
}