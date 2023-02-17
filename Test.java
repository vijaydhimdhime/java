class Foo
{
	public Foo()
	{
		m1();
	}
	void m1()
	{
		System.out.println("Foo");
	}
}
 class Bar extends Foo
{
	int x = 10 ;
	void m1()
	{
		System.out.println("x = "+x);
	}
	
}
public class Test
{
	
	public static void main(String[] args)
	{
		Foo f = new Bar();
		f.m1();
	}
}