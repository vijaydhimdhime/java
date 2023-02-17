           // salary of employee
		 
		 
class Employee
{
	String name;
	int age;
	float salary;
	String compName;
	
	void insert(String nm, int a, float s, String cn)
	{
		name = nm;
		age = a;
		salary = s;
		compName = cn;
	}
	void disp()
	{
		System.out.println(name+"  "+age+"   "+salary+"   "+compName);
		
	}
}
public class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.insert("vijay", 25, 21000, "TATA");
		e1.disp();
	}
}		 