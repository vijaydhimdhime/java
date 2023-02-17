import java.util.*;
public class BreakStatements {

    public static void main(String[] args) 
	{

    /*    int x = 0;
        while (x <= 21)
		{
            if(x < 21)
			{
                System.out.println("You cannot drink because you are only " + x + " years old.");
                x++;
                continue;
            }
			else
			{
                System.out.println("You may drink because you are " + x + " years old.");
                break;
            }
        }   */
	


/*	int x=0;
		if(x < 21){
    System.out.println("You cannot drink because you are only " + x + " years old.");
    x++;
    continue;
}
		*/
		
	/*	int myAge=20;
		int voterAge=18;
		if(myAge>=voterAge)
		{
			System.out.println("Old enough to vote ....");
		}
		else{
			System.out.println("Not old enough to vote ....");                
		}                           */
		
	/*	int number1;
		int number2;
		int number3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number1: ");
		number1 = sc.nextInt();
	
	System.out.print("Input the first number1: ");
		number2 = sc.nextInt();
		System.out.print("Input the first number1: ");
		number3 = sc.nextInt();
		if(number1<number2)
		{
			System.out.println("The smallest : "+number1);
		}
		else if(number2<number3){
			System.out.println("The smallest : "+number2);
		}
	else{
		System.out.println("The smallest : "+number3);
	}
		*/
		float number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any number");
		number = sc.nextInt();
		if(number==0){
			System.out.println(number+" "+"is zero");
		}
		else if(number>0){
			System.out.println(number+" "+"is +ve");
		}
		else{
			System.out.println(number+" "+"is -ve");
			
		}
    }                 
	
	
	

}