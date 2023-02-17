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
 class Bar extendx Foo
{
	int x = 5;
	void m1()
	{
		System.out.println("x = "+x);
	}
	
}
public class Test
{
	
	public static void main(String[] args)
	{
		Foo f = new Foo();
		f.m1();
	}
}