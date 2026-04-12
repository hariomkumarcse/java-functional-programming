interface IOp
{
	double doOp(double num);
}
class UtilOp
{
	static double perfromOp(IOp ref, double data)
	{
		return ref.doOp(data);
	}

}
class LambdaMain
{
	public static void main(String args[])
	{
		System.out.println(UtilOp.perfromOp(num-> num*num, 4));
		System.out.println(UtilOp.perfromOp(num-> num*num*num, 4));

		System.out.println(UtilOp.perfromOp(num-> Math.sqrt(num), 4));
		System.out.println(UtilOp.perfromOp(num-> Math.cbrt(num), 27));

		System.out.println(UtilOp.perfromOp(Math::sqrt, 4));
		System.out.println(UtilOp.perfromOp(Math::cbrt, 27));

	}
}