interface IMath
{
	int add(int a, int b);


}
class LambdaDemo
{
	public static void main(String args[])
	{
		IMath ref = (int a, int b) -> {
			return a+b;
			};
		System.out.println(ref.add(4,5));

		ref = (a,b) -> a+b;
		System.out.println(ref.add(4,2));


	}

}