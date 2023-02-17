
                       /*   main() outside the class  */

class Inside
{
	String name;
	int age;
	String address;
	
	
}
class Outside
{
	public static void main(String[] args)
	{
		Inside a1 = new Inside();
		a1.name= "VIJAY DHIMDHIME";
		a1.age = 25;
		a1.address = "pune";
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.address);
	}
}
/*
  class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 }  
}  */