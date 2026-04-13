interface IOp
{
	int add(int a, int b);
}
class ClsOp implements IOp
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class InnerClsDemo
{
	public static void main(String args[])
	{
		IOp ref = new ClsOp();
		System.out.println(ref.add(3,4));
	}
}