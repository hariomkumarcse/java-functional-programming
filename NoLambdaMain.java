interface IOp
{
	double doOp(double num);


}
class ClsOp1 implements IOp
{
	public double doOp(double num)
	{
		return num*num;
	}

}
class ClsOp2 implements IOp
{
	public double doOp(double num)
	{
		return num*num*num;
	}
}
class UtilOp
{
	static double perfromOp(IOp ref, double data)
	{
		return ref.doOp(data);

	}
}
class NoLambdaMain
{
	public static void main(String args[])
	{
		IOp opRef;
	
		opRef = new ClsOp1();
		System.out.println(UtilOp.perfromOp(opRef,4));
		
		opRef = new ClsOp2();
		System.out.println(UtilOp.perfromOp(opRef,4));

	}



}