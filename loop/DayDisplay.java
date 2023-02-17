import java.util.*;
public class DayDisplay{
public static void main(String[] args){
int day;
Scanner sc = new Scanner(System.in);
System.out.println("Enter day number: ");
day = sc.nextInt();
/*
if(day==0)
{
	System.out.println("Sunday");
}else if(day==1)
{
	System.out.println("Manday");
}
else if(day==2)
{
	System.out.println("Tusday");
}
else if(day==3)
{
	System.out.println("Wensday");
}
else if(day==4)
{
	System.out.println("Thursday");
}
else if(day==5)
{
	System.out.println("Friday");
}
else if(day==6)
{
	System.out.println("Sturday");
}
*/
switch(day)
{
	case 1:	System.out.println("Sunday");
	break;
	case 2:	System.out.println("Manday");
	break;
	case 3:	System.out.println("Tusday");
	break;
	case 4:	System.out.println("Wensday");
	break;
	case 5:	System.out.println("Thursday");
	break;
	case 6:	System.out.println("Friday");
	break;
	case 7:	System.out.println("Sturday");
	break;
	default: System.out.println("Invalid Day...");
}

}
}