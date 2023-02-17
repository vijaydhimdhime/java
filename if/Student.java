import java.util.*;
public class Student
{
	public static void main(String[] args)
	{
		int maths;
		int chem;
		int phy;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of maths     : ");
		maths = sc.nextInt();
		System.out.print("Enter the marks of chemistry : ");
		chem = sc.nextInt();
		System.out.print("Enter the marks of physics   : ");
		phy = sc.nextInt();
		
		double result=maths+chem+phy;
		double avg = result/3;
		System.out.println("percentage = "+avg+"%");
		if(avg<40)
		{
			System.out.println("Student is Fail!!!!!!!");
		}
		if(avg>=40 && avg<50)
		{
			System.out.println("Student is pass with grade C");
		}
		if(avg>=50 && avg<60)
		{
			System.out.println("Student is pass with grade B");
		}
		if(avg>=60 && avg<70)
		{
			System.out.println("Student is pass with grade A");
		}
		if(avg>=70 && avg<80)
		{
			System.out.println("Student is pass with grade A+");
		}
		if(avg>=80 && avg<90)
		{
			System.out.println("Student is pass with grade A+ with Destinction");
		}
	}
}