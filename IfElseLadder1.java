import java.util.Scanner;
public class IfElseLadder1
{
	public static void main(String[] args)
	{
		//System.out.println("Student Grade is : "+StudentGrade(34));
		//Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Students Marks....");
		int result = input.nextInt();
		System.out.println("Student Grade is : "+result);
	
	}
		public static String StudentGrade(int marks)
		{
		if(marks<35)
			{
			System.out.println("==============================");
			return "Student is Fail...";
			}
			else if(marks>=50 && marks<=60)
			{
			System.out.println("==============================");
			return "Grade is B";

			}
			else if(marks>60 && marks>=70)
			{
			System.out.println("==============================");
			return "Grade is A";
			}
			else if(marks>70)
			{
			System.out.println("==============================");
					return "Grade is A+";
			}
			else
			{
			System.out.println("==============================");
			return "Invalid data";
			}
		}
	
}
				
		