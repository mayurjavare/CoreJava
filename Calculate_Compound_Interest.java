import java.util.Scanner;
class CompoundInterest
{
	public static void main(String args[])
	{
		float pa,tim,ir;
		double ci;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principle amount: ");
		pa = sc.nextFloat();
		System.out.println("Enter the Interest Rate: ");
		ir = sc.nextFloat();
		System.out.println("Enter the Time period in Years: ");
		tim = sc.nextFloat();
	
		ci = pa*(Math.pow((1+ir/100),tim));
	
		System.out.println("The final amount is: "+ci);
	}
}