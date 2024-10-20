import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		int num,i=1,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num	= sc.nextInt();

		while(i<=10)
		{
			sum = num*i;
			System.out.println(num + " x " + i + " = " + sum);
			i++;
		}
	}
}