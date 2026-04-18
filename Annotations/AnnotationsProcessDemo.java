import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface OnClass
{
	int noMembers();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OnMethod
{
	int noParams();
}

@OnClass(noMembers=3)
class Cls
{
	int a;

	@OnMethod(noParams=1)
	void setA(int a)
	{
		this.a=a;
	}

	@OnMethod(noParams=0)
	int getA()
	{
		return a;
	}
}
class AnnotationsProcessDemo
{
	public static void main(String args[])
	{
		Class<Cls> ref = Cls.class;

		System.out.println("Name: "+ref.getName());

		if(ref.isAnnotationPresent(OnClass.class))
		{
			OnClass anno = ref.getAnnotation(OnClass.class);
			System.out.println("No. Of members: "+anno.noMembers());
		}

		Method[] methods = ref.getDeclaredMethods();
		System.out.println("No of methods: "+methods.length);

		for(Method method: methods)
		{
			System.out.println(method.getName());

			if(method.isAnnotationPresent(OnMethod.class))
			{
				OnMethod anno = method.getAnnotation(OnMethod.class);

				System.out.println("No.Of Parameters: " +anno.noParams());
			}
		}

	}

}