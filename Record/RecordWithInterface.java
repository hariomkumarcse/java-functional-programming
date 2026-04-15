interface Person
{
	void getDetails();
}
record Student(int rollNo, String name) implements Person
{
	static private int count;
	
	Student()
	{
		this(999,"Unknown");
	}
	Student
	{
		count ++;
	}
	public void getDetails()
	{
		System.out.println("Roll No: " +rollNo);
		System.out.println("Name: " + name);
	}
	public String name()
	{
		return "Mr. " +name;
	}
	static void printCount()
	{
		System.out.println("No. Of objects created: " +count);
	}
}
class CR
{

}	
class RecordWithInterface
{
	public static void main(String args[])
	{
		Student s1 = new Student(1, "Hariom");
		Student s2 = new Student(1, "Hariom");
	
		Student s3 = new Student();
		
		//s2.setRollNo(2); Not possible to modification of record 
		
		System.out.println(s1.name());
		System.out.println(s1.rollNo());
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s2.equals(s1));
		System.out.println(s1.hashCode());

		s3.getDetails();
		Student.printCount();
	}
}