                    // Inilization of Object through method


class StudentInfo
{
	String name;
	String address;
	
	void insertInfo(String n, String add)
	{
		name=n;
		address = add;
	}
	void dispInfo()
	{
		System.out.println(name+"    "+address);
	}


	public static void main(String[] args)
	{
		StudentInfo sc = new StudentInfo();
	
		sc.insertInfo("kumar", "pune");
		sc.dispInfo();
	}
}
