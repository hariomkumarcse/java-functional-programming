interface IOp
{
	double doOp(double num);
}
class UtilOp
{
	static double performOp(IOp ref, double data)
	{
		return ref.doOp(data);
		
	}
}
class MyClass
{
	double scale(double num)
	{
		return num*3;
	}
}
class MethodReferanceMain
{
	public static void main(String args[])
	{
		System.out.println(UtilOp.performOp(Math::sqrt,4));
		System.out.println(UtilOp.performOp(Math::cbrt,27));

		MyClass obj = new MyClass();
		System.out.println(UtilOp.performOp(obj::scale,27)); //27*3= 81.0

	}
}