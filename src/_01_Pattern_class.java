import java.util.regex.Pattern;

public class _01_Pattern_class {
    public static void main(String[] args) {
        /*
        Pattern class is a compiled version of regular expression which is used to define the Regex pattern
         */

        Pattern pattern = Pattern.compile("[a-z0-9]{3,15}");

        System.out.println(pattern); // prints the return
        System.out.println(pattern.pattern()); // returns and prints the pattern as a String
        System.out.println(pattern.toString()); // returns and prints the pattern as a String

        System.out.println(Pattern.matches(pattern.toString(), "Apple")); // false due to uppercase A
        System.out.println(Pattern.matches(pattern.pattern(), "apples3")); // true as it has only lowercase letters and digits and the length is between 3 and 15
    }
}
