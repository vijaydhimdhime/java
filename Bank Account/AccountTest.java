class Account
{	
		int accountNumber;
		String name;
		String accountHolderName;
		float amount;
		
		void insert(int an, String nm, String ahn, float amt)
		{
			accountNumber = an;
			name = nm; 
			accountHolderName = ahn;
			amount = amt;
		}
		void diposite(float amt)
		{
			amount = amount+amt;
			System.out.println();
			System.out.println("Diposited           : "+amt);
			
			//System.out.println("Diposite amount        : "+amount);
		}
		void withdrow(float amt)
		{
			if(amount<amt)
			{
				System.out.println("Insuficient Balance........");
			}
			else
			{
				amount = amount-amt;
				System.out.println();
				System.out.println("Withdrow            : "+amt);
			}
		}
		void checkBalance()
		{
			System.out.println();
			System.out.println("Balance is          : "+amount);
		}
		void display()
		{
			System.out.println();
			System.out.println("Account Name        : "+name);
			System.out.println();
			System.out.println("Account Holder Name : "+accountHolderName);
			System.out.println();
			System.out.println("Account Number      : "+accountNumber);
			System.out.println();
			System.out.println("Account Amount      : "+amount);
			
			//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
}
class AccountTest
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.insert(520, "Bank of India", "Mr.Vijay Dhimdhime", 36000);
		a1.display();
		//a1.checkBalance();
		a1.diposite(700);
		a1.checkBalance();
		a1.withdrow(36600);
		a1.checkBalance();
		//a1.display();
		
	}
}