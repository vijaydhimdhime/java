class Fruit
{
	String name;
	String color;
	String test;
	void show(String n, String c, String t)
	{
		name = n;
		color = c;
		test = t;
	}
	void disp()
	{
		System.out.println(name+" "+color+" "+test);
	}
	public static void main(String[] args)
	{
		
		Fruit f1 = new Fruit();
		f1.show("Apple", "Red", "Sweet");
		f1.disp();
	}
}