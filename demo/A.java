                    // Inilization of Object through ref. vari.


class A
{
	int age;
	String name;
	String address;


	public static void main(String[] args)
	{
		A sc = new A();
		A sc2 = new A();
		sc.age=15;
		sc.name = "vijay";
		sc.address="pune";
			sc2.age=105;
		sc2.name = "vijay Dhimdhime";
		sc2.address="pune, solapur";
		System.out.println(sc.age+"   "+sc.name+"    "+sc.address);
		System.out.println(sc2.age+"   "+sc2.name+"    "+sc2.address);
	}
}
