import java.util.*;
class vote
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("enter age");
	age=sc.nextInt();
	if(age>=18)
	{
	System.out.println("eligible for vote");
	}
	else
	{
	System.out.println("not eligible,eligible after"+(18-age));
	}
	}
}
	
