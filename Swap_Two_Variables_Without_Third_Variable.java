import java.util.Scanner;
class SwapWithout
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A:");
		a = sc.nextInt();
		System.out.println("Enter B:");
		b = sc.nextInt();

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swaped values are: ");
		System.out.println("A = : "+a);
		System.out.println("B = : "+b);
	}
}