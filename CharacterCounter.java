import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        
        System.out.println("Enter characters (input '*' to stop):");
        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);
            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        
        System.out.println("Total count of lowercase letters: " + lowercaseCount);
        System.out.println("Total count of uppercase letters: " + uppercaseCount);
        System.out.println("Total count of digits: " + numberCount);
        
        scanner.close();
    }
}
