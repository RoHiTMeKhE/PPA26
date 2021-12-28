
class demostring
{
public static void main(String arg[])
{
String str1="hello";              //1
String str2=new String("Hello");  //2
char Arr[]={'H','e','l','l','o'}; //3
String str3=new String(Arr);
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
 
 System.out.println("String length is : "+str1.length()); // length method
 System.out.println("array length is : "+Arr.length);     // length property   
   
    String s1="demo";
	String s2="demo";
	String s3="demo";
	
	String s4=new String("demo");
	String s5=new String("demo");
	String s6=new String("demo");

for(int j=0;j<s6.length();j++)
{
	System.out.println(s6.charAt(j));
}
char Brr[]=s6.toCharArray();
for(int i=0;i<Brr.length;i++)
{
	System.out.println(Brr[i]);
}

}
}