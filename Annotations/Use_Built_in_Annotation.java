import java.lang.Deprecated;

@FunctionalInterface
interface MyInterface
{
	void show();
}

class Parent
{
	void display()
	{
		System.out.println("Parent display method");
	}

@Deprecated
void oldMethod() 
{
	System.out.println("This method is deprecated");
} 
}
