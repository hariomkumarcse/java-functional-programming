import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Roles.class)
@interface Role
{
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Roles
{
	Role[] value();
}

@Role("Mentor")
@Role("CC")
@Role("SubHead")
class Teacher 
{
	int id;
	String name;

	void setId(int id)
	{
		this.id = id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
}
class  RepeatableAnnotationsDemo
{
	public static void main(String args[])
	{
		Class<Teacher> teacher = Teacher.class;

		if(teacher.isAnnotationPresent(Roles.class))
		{
			Role[] roles = teacher.getAnnotationsByType(Role.class);
			for(Role role: roles)
				System.out.println("Role: "+role.value());
		}
	}
}