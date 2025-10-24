import java.util.*;

public class Snippets
{
	public static void main(String args[])
	{
		// creating Scanner to obtain input from command line

		Scanner console = new Scanner(System.in);

		int number1;
		int number2;

		System.out.print("Enter first integer:");
		number1 = console.nextInt();
		System.out.print("\nEnter second integer:");
		number2 = console.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d\n",number1,number2);
		if (number1 != number2)
			System.out.printf("%d != %d\n",number1,number2);
		if (number1 < number2)
			System.out.printf("%d < %d\n",number1,number2);		
		if (number1 > number1)
			System.out.printf("%d > %d",number1,number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d",number1,number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d",number1,number2);
		
	} // end of main method
}		// end of class