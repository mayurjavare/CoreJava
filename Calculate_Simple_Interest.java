import java.util.Scanner;
class SimpileInterest
{
	public static void main(String args[])
	{
		float pa,tim,ir,si;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principle amount: ");
		pa = sc.nextFloat();
		System.out.println("Enter the Interest Rate: ");
		ir = sc.nextFloat();
		System.out.println("Enter the Time period in Years: ");
		tim = sc.nextFloat();
	
		si = (pa*tim*ir/100);
	
		System.out.println("The final amount is: "+si);
	}
}