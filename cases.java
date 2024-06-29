import java.util.*;

class Character
{
    public static void main(String arg[]) 
{
        Scanner Sc = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        
        System.out.println("Enter characters (input '*' to stop):");
        while (true) 
{
            char ch = scanner.next().charAt(0);
            if (ch == '*') 
	    {
                break;
            }
            if (Character.isUpperCase(ch)) 
	    {
                uppercaseCount += 1;
            } else if (Character.isLowerCase(ch))
	 {
                lowercaseCount += 1;
            } else if (Character.isDigit(ch))   	
	{
                numberCount += 1;
            }
        }
        
        System.out.println("Uppercase letters count: " + uppercaseCount);
        System.out.println("Lowercase letters count: " + lowercaseCount);
        System.out.println("Numbers count: " + numberCount);
    }
}