record Student(int rollNo, String name)
{

}
class RecordDemo
{
	public static void main(String args[])
	{
		Student s1 = new Student(1,"Hariom");
		Student s2 = new Student(2, "Hariom");
		System.out.println(s1.name());
		System.out.println(s2.rollNo());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.equals(s1));

	}
}