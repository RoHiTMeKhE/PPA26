import java.io.*;
class Buffered
{
	public static void main(String arg[])
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("ENTER NAME");
		String str = bobj.readLine();
		
		System.out.println("enter your age");
		int age= Integer.parseInt(boj.readLine);
		
		System.out.println("Your name : "+str);
		System.out.println("Your age: "+age);
	}
}