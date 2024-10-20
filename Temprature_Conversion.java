import java.util.Scanner;
class TempratureConversion
{
	public static void main(String args[])
	{	
		float temp,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius: ");
		temp = sc.nextFloat();

		f = (temp*1.8f)+32;

		System.out.println("Temperature in Fahrenheit: "+f);
	}
}