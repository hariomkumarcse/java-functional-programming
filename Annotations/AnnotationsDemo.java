@FunctionalInterface
interface IFunc
{
	void m1();
}
@interface Members
{
	int value() default 0;
}
@Members(3)
class Cls
{
	int a;
		
	void setA(int a)
	{
		this.a = a;
	}	
	int getA()
	{
		return a;
	}
}
class AnnotationsDemo
{
	public static void main(String args[])
	{

	}
}