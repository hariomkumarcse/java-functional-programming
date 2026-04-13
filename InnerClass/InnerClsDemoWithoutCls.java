interface IOp
{
	int add(int a, int b);
}
//class ClsOp implements IOp

class InnerClsDemoWithoutCls
{
	public static void main(String args[])
	{
		IOp ref = new IOp() {
	public int add(int a, int b)
	{
		return a+b;
	}
};
		System.out.println(ref.add(3,4));
	}
}