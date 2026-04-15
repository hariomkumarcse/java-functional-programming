interface IOp<T>
{
	T add(T a,T b);
}
//class ClsOp implements IOp

class InnerClsDemoWithoutCls
{
	public static void main(String args[])
	{
		IOp<Integer> ref = new IOp<>() {
	public Integer add(Integer a, Integer b)
	{
		return a+b;
	}
};
		System.out.println(ref.add(3,4));
	}
}