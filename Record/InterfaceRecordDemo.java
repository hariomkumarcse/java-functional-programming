interface Person
{
	void getDetails();

}
record Student(int rollNo, String name) implements Person
{
	static private int count;

	Student()
	{
		this(999,"Unknonw");
	}
	Student
	{
		count ++;
	}
	
	public void getDetails()
	{
		System.out.println("Roll No: " +rollNo);
		System.out.println("Name: " +name);
	}
	public String name()
	{
		
	}

}
class RecordDemo
{
	public static void main(String args[])
	{
		Student s1 = new Student(1, "Hariom");
		Student s2 = new Student(1, "Hariom");

		System.out.println(s1.name());
		System.out.println(s1.rollNo());
		System.out.println(s1);
		System.out.println(s2);
		

	}
}