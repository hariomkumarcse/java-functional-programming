import java.util.Scanner;
class SwitchExpression
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

		result = switch(choice)
		{
			/*case 'A','P' -> num1 + num2;
			case 'S', 'M' -> num1 - num2;
			default -> '0'; */
	
			case 'A', 'P' ->{
					System.out.println("You Chose Addition");
					yield num1+num2;
				}
			case 'S', 'M' ->{
					System.out.println("You Chose Subtraction");
					yield num1-num2;
				}
			default -> {
					System.out.println("Wrong Choice");
					yield 0;
				}
				
		};
		System.out.println("Result: " +result);
		sc.close();
	}
} 