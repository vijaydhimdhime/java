import java.util.*;
public class MonthDay
{
	public static void main(String[] args)
	{
		int day;
		int month;
		String MonthName = "UNKNOWN";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month...");
		month = sc.nextInt();
		switch(month)
		{
			case 1:
			MonthName = "January has 31 days"; 
			break;
			case 2:
			MonthName = "January has 31 days";
			break;
			case 3: MonthName  = "January has 31 days";
			break;
			case 4: MonthName = "January has 31 days"; 
			break;
			case 5: MonthName ="January has 31 days"; 
			break;
			case 6: MonthName ="January has 31 days";
			break;
			case 7: MonthName ="January has 31 days";
			break;
			case 8: MonthName ="January has 31 days";
			break;
			case 9: MonthName ="January has 31 days"; 
			break;
			case 10: MonthName ="January has 31 days";
			break;
			case 11: MonthName ="January has 31 days"; 
			break;
			case 12: MonthName ="January has 31 days"; 
			break;
			default : System.out.println("Invalid month....");
			
		}
		System.out.print(MonthName);
	}
}