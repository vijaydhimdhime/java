class Employeee
{
	String name;
	int age;
	String companyName;
	float salary;
	
	void insertRecord(String na, int a, String cn, float s)
	{
		name = na;
		age = a;
		companyName = cn;
		salary = s;
	}
	void displayRecord()
	{
		System.out.println(name+"  "+age+"  "+companyName+"  "+salary);
		System.out.println(name+"  "+age+"  "+companyName+"  "+salary);
	}
}
class EmployeeSalary
{
	Public static void main(String[] args)
	{
		Employeee e = new Employeee();
		Employeee e1 = new Employeee();
		e.insertRecord("vijay", 28, "Infosis", 90000);
		e1.insertRecord("Sandip", 32, "Tecnosis", 1250000);
		e.displayRecord();
		e1.displayRecord();
		
	}
}