import java.util.Scanner;
import static java.lang.Math.sqrt;
class PowerCal
{
	public static void main(String args[])
	{
		int num,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		System.out.println("Enter the power: ");
		n = sc.nextInt();

		System.out.println("Answer: "+Math.pow(num,n));
	}
}