import java.util.Scanner;
class StudentMarks
{
	public static void main(String args[])
	{
		float phy,chem,math,total,avg;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Marks of Physics: ");
		phy = sc.nextFloat();
		System.out.println("Enter the Marks of Chemistry: ");
		chem = sc.nextFloat();
		System.out.println("Enter the Marks of Math: ");
		math = sc.nextFloat();

		total = phy + chem + math;
		avg = total/3;

		System.out.println("Total Marks: "+total);
		System.out.println("Avarage: "+avg);
	}
}