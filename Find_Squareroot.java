import java.util.Scanner;
import static java.lang.Math.sqrt;
class Squareroot
{
	public static void main(String args[])
	{
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the integer number: ");
		num = sc.nextInt();
	
		System.out.println("The sqare root is: "+sqrt(num));
	}
}