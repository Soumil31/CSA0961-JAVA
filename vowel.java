import java.util.*;
class vowel
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int count=0,i;
	String s1;
	System.out.println("enter");
	s1=sc.nextLine();
	for(i=0;i<=6;i++)
	{
	char ch=s1.charAt(i);
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	{
	count++;
	}
	}

System.out.print(count);
}
}