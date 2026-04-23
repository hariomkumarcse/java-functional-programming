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

class Child extends Parent 
{
	@Override
	void display()
	{
		System.out.println("Child display method");
	}
}
class Use_Built_in_Annotation
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		MyInterface obj = () -> 
			System.out.println("Hello from Lambda!");
			obj.show();
	
			Child c = new Child();
			c.display();
			c.oldMethod();
	}
} 