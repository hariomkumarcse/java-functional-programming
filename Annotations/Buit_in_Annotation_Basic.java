class Parent 
{
	void show()
	{
		System.out.println("Parent method");
	}
	
}
class Child extends Parent
{
	@Override
	void show()
	{
		System.out.println("Child method");
	}
} 
class Buit_in_Annotation_Basic
{
	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.show();
	}
} 