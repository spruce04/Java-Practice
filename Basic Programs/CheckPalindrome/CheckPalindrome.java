//check if the entered word is a palindrome

import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        //get a word that the user enters
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome: ");
        String chosen = scanner.next();

        //check if it is a palindrome
        String reversed = "";
        for(int i = chosen.length()-1; i >= 0; i--) {
            reversed += chosen.charAt((i));
        }
        if (reversed.equals(chosen)) {
            System.out.println(chosen + " is a palindrome");
        }
        else {
            System.out.println(chosen + " is not a palindrome");
        }
    }
}