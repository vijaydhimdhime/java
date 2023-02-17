class Employeee
{
	String name;
	int age;
	String companyName;
	double salary;
	
	void insertRecord(String na, int a, String cn, double s)
	{
		name = na;
		age = a;
		companyName = cn;
		salary = s;
	}
	void displayRecord()
	{
		System.out.println("name: "+name+" "+"age: "+age+"  "+"companyName: "+companyName+"  "+"salary: "+salary);
		//System.out.println(name+"  "+age+"  "+companyName+"  "+salary);
	}
}
class EmployeeSalary
{
	public static void main(String[] args)
	{
		Employeee e = new Employeee();
		Employeee e1 = new Employeee();
		e.insertRecord("'vijay'", 28, "Infosis", 80000.999d);
		e.displayRecord();
		e1.insertRecord("Sandip", 32, "Tecnosis", 125000.999d);
		e1.displayRecord();
		
	}
}