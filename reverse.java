import java.util.*;
class reverse
{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	String soumil;
	System.out.println("enter");
	soumil=sc.nextLine();
	String reverse="";
	for(int i=5;i>=0;i--)
	{
	reverse+=soumil.charAt(i);
	}
	System.out.print(reverse);
	}
}