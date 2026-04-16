import java.util.Scanner;
class SwitchCase
{
	public static void main(String[] args)
	{
		int num1,num2;
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();

		System.out.println("Enter You Choice: ");
		choice=sc.next().charAt(0);

		int result = 0;

		switch(choice)
		{
			case 'A':
			case 'P':
				System.out.println("Your Choice Addition: ");
				result = num1+num2;
				break;
			case 'S':
			case 'M':
				System.out.println("Your Choice Subtraction: ");
				result = num1-num2;
				break;
			default :
				result = 0;
		}
		System.out.println("Result: " +result);
		sc.close();
	}
} 