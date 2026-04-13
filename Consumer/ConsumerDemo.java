import java.util.function.Consumer;
class ConsumerDemo
{
	public static void main(String args[])
	{
		Consumer<Integer> ref = str -> System.out.println(str);
		ref.accept(10);

		Consumer<String> ref1 = str -> System.out.println(str);
		ref1.accept("MIT");
	}	

}