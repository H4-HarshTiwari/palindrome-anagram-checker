import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("   PALINDROME & ANAGRAM CHECKER   ");
        System.out.println("=================================");

        while (true) {
            System.out.println("1. Check Palindrome.");
            System.out.println("2. Check Anagram.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("You selected Palindrome Check.");
                System.out.print("Enter a String : ");
                String s = sc.nextLine();

                boolean result = PalindromeChecker.isValidPalindrome(s);
                if (result) {
                    System.out.println("The \"" + s + "\" is a Palindrome");
                   
                } else {
                    System.out.println("The \"" + s + "\" is not a Palindrome");
                 

                }
            } else if (choice == 2) {
                System.out.println("You selected Anagram Check.");
                System.out.print("Enter 1st String : ");
                String s1 = sc.nextLine();
                System.out.print("Enter 2nd String : ");
                String s2 = sc.nextLine();

                boolean result = AnagramChecker.isAnagram(s1, s2);
                if (result) {
                    System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are Anagrams");
                    
                } else {
                    System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not Anagrams");
                    
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice.");
            }
            System.out.println("\n--- Back to Menu ---\n");

        }
        sc.close();
    }

}
