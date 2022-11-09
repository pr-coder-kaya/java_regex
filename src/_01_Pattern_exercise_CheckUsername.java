import java.util.Scanner;
import java.util.regex.Pattern;

public class _01_Pattern_exercise_CheckUsername {
    public static void main(String[] args) {
        /*
        Ask the user to enter a username.
        If the username matches the format of [a-zA-Z0-9]{5,10}, print out "The username entered is valid!".
        If it does not match the desired format then print out "The username entered is NOT valid! It must be 5 to 10 characters long and can only contain letters and digits"

        Test data 1:
        Program: Please enter a username
        User: JDoe123
        Program: The username entered is valid!

        Test data 2:
        Program: Please enter a username
        User: John Doe
        Program: The username entered is NOT valid! It must be 5 to 10 characters long and can only contain letters and digits
         */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a username");
        String username = scanner.nextLine();

        if (Pattern.matches("[a-zA-Z0-9]{5,10}", username)) System.out.println("The username entered is valid!");
        else System.out.println("The username entered is NOT valid! It must be 5 to 10 characters long and can only contain letters and digits");
    }
}
