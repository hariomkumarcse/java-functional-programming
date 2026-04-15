sealed class User permits Admin,Teacher,Student
{
	String username;
	String password;
	
	User(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	public String toString()
	{
		return "User: " +username +"-->"+password;
	}
} 
sealed class Admin extends User permits ClassTeacher 
{
	Admin(String username, String password)
	{
		super(username, password);
	}
	public String toString()
	{
		return "Admin: " +username+ "-->" +password;
	}
}
non-sealed class Teacher extends User
{
	Teacher(String username,String password)
	{
		super(username, password);
	}
	public String toString()
	{
		return "Student: "+username+ "-->"+password;
	}
}
final class Student extends User
{
	Student(String username, String password)
	{
		super(username, password);
	}
	public String toString()
	{
		return "Student: "+username+"-->"+password;
	}
} 
non-sealed class ClassTeacher extends Admin
{
	ClassTeacher(String username, String password)
	{
		super(username, password);
	}
	public String toString()
	{
		return "ClassTeacher: "+username+"-->"+password;
	}

} 
class SealedDemo
{
	public static void main(String args[])
	{
		Student s = new Student("Hariom", "123");
		System.out.println(s);

		ClassTeacher c = new ClassTeacher("Amol" , "23A");
		System.out.println(c);
	}
}