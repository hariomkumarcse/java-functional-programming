import java.util.*;
class ForEachDemo
{
	public static void main(String args[])
	{
		ArrayList<String> institutes = new ArrayList<>();

		Collections.addAll(institutes, "MIT", "MIET", "KIET", "ABES");
	
		institutes.forEach(str->System.out.println(str));
		institutes.forEach(str->System.out.println(str.length()));
		institutes.forEach(str->System.out.println(str.toLowerCase()));
		institutes.forEach(str->System.out.println(str.toUpperCase()));


		institutes.forEach(System.out::println);

	}

}