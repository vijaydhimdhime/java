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
		A sc3 = new A();
		sc.age=15;
		sc.name = "vijay";
		sc.address="pune";
			sc2.age=105;
		sc2.name = "vijay Dhimdhime";
		sc2.address="pune, solapur";
		sc3.age = 30;
		sc3.name = "java";
		sc3.address = "Munbai, Maharastra";
		System.out.println(sc.age+"   "+sc.name+"    "+sc.address);
		System.out.println(sc2.age+"   "+sc2.name+"    "+sc2.address);
		System.out.println(sc3.age+"   "+sc3.name+"    "+sc3.address);
	}
}
