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
		int x = 0;
		boolean isAgeReached = false;

		while (!isAgeReached) 
		{
			if (x < 21) 
			{
				System.out.println("You cannot drink because you are only " + x + " years old.");
				x++;

			} 
			else
			{
				System.out.println("You may drink because you are " + x + " years old.");
				isAgeReached = true;
			}
		}
		
		
    }                 
	
	
	

}