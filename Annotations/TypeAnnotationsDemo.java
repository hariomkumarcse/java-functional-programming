import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface CodeType
{
	String value();
}
class Cls
{
	@CodeType("Attribute Type") int a;

	void setA(@CodeType("Parameter Type")int a)
	{
		this.a = a;
	}
	@CodeType("Return Type")int getA()
	{
		return a;
	}
	void method1() throws @CodeType("Exception Type") IllegalArgumentException
	{
		throw new IllegalArgumentException();
	}
}
class TypeAnnotationsDemo
{
	public static void main(String args[])
	{
		Cls obj = new @CodeType("Class Type")Cls();
		System.out.println(obj.getA());
	}
}