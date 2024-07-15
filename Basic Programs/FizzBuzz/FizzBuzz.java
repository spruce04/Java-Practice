//if divisible by 5, fizz
//if divisible by 3, buzz
//if divizible by both fizzbuzz 
//if not divisible by either, print the number on the terminal
import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chosen number to loop until: ");
        int chosenNumber = scanner.nextInt();

        //use a for loop to go through all the required numbers
        for (int i = 0; i <= chosenNumber; i++) {
            //if statement to check the numbers divisibility
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("buzz");
            }
            else if (i % 5 == 0) {
                System.out.println("fizz");
            }
            else {
                System.out.println(i);
            }
        }
        
    }
}
