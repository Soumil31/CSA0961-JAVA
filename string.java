import java.util.*;
class string
{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.println("enter s1");
	s1=sc.nextLine();
	System.out.println("enter s2");
	s2=sc.nextLine();
	if(s1.equals(s2))
	{
	System.out.println("valid");
	}
	else
	{
	System.out.println("invalid");
	}
}
}