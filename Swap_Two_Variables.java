import java.util.Scanner;
class SwapVariables
{
	public static void main(String args[])
	{	
		int a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A: ");
		a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		b = sc.nextInt();

		c=a;
		a=b;
		b=c;

		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}