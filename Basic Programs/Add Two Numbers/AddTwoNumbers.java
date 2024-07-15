//program to add 2 numbers as entered by the user
import java.util.Scanner;

class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        int result = first + second;
        System.out.println("The result is " + result);
    }
}