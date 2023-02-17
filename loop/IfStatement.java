import java.util.Scanner;
public class StudentGrade
{
	public static void main(String[] args)
	{
		int marks;
		System.out.print("Enter students marks: -> ");
		Scanner sc = new Scanner(System.in);
		marks=sc.nextInt();
		
		if(marks<40)
		{
			System.out.println("Student Fail....");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("Student Pass....");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("Student Grade is B....");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("Student Grade is A.....");
		}
		else
		{
			System.out.println("Student Grade is A+....");
		}
		
	}
}