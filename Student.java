public class Student
{
	
	String name;                 // instance var.
	int rollNo;
	int id;
	static int age;              // static var.
	boolean std;
	double c;
	Student()                   //constructor
	{
		System.out.println(name +" "+rollNo+" "+id+" "+std+" "+c);
	}
	
	void Display()              // instance method
	{
		
	}
	                   // instance block
	{
		
	}
	
	
	
	public static void main(String[] args)    // main method OR static method
	{
		Student s1 = new Student();
		//System.out.println(s1.Student());
	}
}