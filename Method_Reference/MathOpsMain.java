interface IMathOps
{
	double apply(double a, double b);
}
class MathOpsMain
{
	public static void main(String args[])
	{
		IMathOps ref = (a,b) -> a+b;
		System.out.println(ref.apply(4,5));

		ref = (a,b) -> a-b;
		System.out.println(ref.apply(4,5));
	
		ref = (a,b) -> a*b;
		System.out.println(ref.apply(4,5));

		ref = (a,b) -> a/b;
		System.out.println(ref.apply(4,5));
	}


}