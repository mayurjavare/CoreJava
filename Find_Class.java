import java.util.Scanner;
class MarksClass
{
	public static void main(String args[])
	{	
		float mrks;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks in percentage: ");
		mrks = sc.nextFloat();
			
		if(mrks>=60 && mrks<75)
			System.out.println("First Class");
		else if(mrks>=75 && mrks<=101)
			System.out.println("Distiction");
		else if(mrks>100)
			System.out.println("Invalid Input");
		else if(mrks>=35 && mrks<60)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
	}
}