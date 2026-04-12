import java.util.*;
interface IMath
{
	int add(int a, int b);

}
class MyMathCls implements IMath
{
	public int add(int a, int b)
	{
		return a+b;
	}

}
class NoLambdaDemo
{
	public static void main(String args[])
	{
		IMath ref = new MyMathCls();

		System.out.println(ref.add(4,5));

	}


}