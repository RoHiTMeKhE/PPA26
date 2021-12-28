import java.util.Scanner;
class ageinvalid extends Exception
{
	public ageinvalid(String str)
	{
		super(str);
	}
}
class exception4
{
	public static void main(String arg[])
	{
     Scanner sobj = new Scanner(System.in);
System.out.println("enter the age");
int age=sobj.nextInt();
try
{
if(age<18)
{
throw new ageinvalid("age is less than 18");
}

}
catch(ageinvalid obj)
{
	System.out.println("exception occured: "+obj);
}
	}
}