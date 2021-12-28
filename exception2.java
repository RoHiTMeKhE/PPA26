import java.util.Scanner;
class exception2
{
	public static void main(String arg[])
	{
		
		Scanner sobj=new Scanner(System.in);
		
		int no1=0,no2=0;
		float result =0.0f;
		
		System.out.println("enter the first number");
		no1=sobj.nextInt();
		System.out.println("enter the second number");
		no2=sobj.nextInt();
		
		result =no1/no2;
		System.out.println("devision  is : "+result);
		
		
	}
}