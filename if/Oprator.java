import java.util.Scanner;
public class Oprator
{
	public static void main(String[] args)
	{
		//int x=50, y=80, z=100;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X : ");
		int x = sc.nextInt();
		System.out.print("Enter Y : ");
		int y = sc.nextInt();
		System.out.print("Enter Z : ");
		int z = sc.nextInt();
		if(y>x || y<z)
		{
			System.out.println("Y is Greater than X But Smaller than Z");
		}
		if(z>y || x<y)
		{
			System.out.println("Z is Greater than X , y");
		}
		if(x<y || z>x)
		{
			System.out.println("x is Smaller than X , Y");
		}
	}
}