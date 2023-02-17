public class IfElseLadder
{
	public static void main(String[] args)
	{
		System.out.println("Student Grade is : "+StudentGrade(76));
	}
	
	private static String StudentGrade(int marks)
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
		else if(marks>60 && marks<=70)
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
				
		