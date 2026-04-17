class Student 
{
	int rollNo= 12;
	void setRollNo(int rn)
	{
		rollNo=rn;
	}
	void printNums()
	{
		for(var i = 1;i<10;i++)
			System.out.println(i);
	}
}
class VarDemo
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setRollNo(23);

		System.out.println("rollNo= "+s.rollNo);

		s.printNums();
		
		int[] arr = {1,2,3,4};
		/*for(var i = 0;i<4; i++)
			arr[i] = i; */

		for(var element:arr)
			System.out.println(element);
	}
}


/*var x;                 // ❌ must initialize
var[] arr = {1,2,3};  // ❌ wrong syntax
var a = null;         // ❌ cannot infer type*/