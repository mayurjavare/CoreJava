import java.util.Scanner;
class DistanceConversion
{
	public static void main(String args[])
	{	
		float km,m,cm,inch,feet;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in km: ");
		km = sc.nextFloat();

		m = km*1000;
		cm = m*100;
		inch = cm*2.54f;
		feet = inch/12;

		System.out.println("Distance in meter: "+m);
		System.out.println("Distance in Centimeter: "+cm);
		System.out.println("Distance in Inches: "+inch);
		System.out.println("Distance in Feet: "+feet);
	}
}