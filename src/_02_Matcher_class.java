import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_Matcher_class {
    public static void main(String[] args) {
        /**
         *The Matcher class is used to match the given String to the given Regex pattern
         */

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher = pattern.matcher("Hello");

        System.out.println(matcher.matches()); // true

        Pattern pattern1 = Pattern.compile("apple");
        Matcher matcher1 = pattern1.matcher("I like red apples, green apples and pineapple");

        System.out.println(matcher1.find()); // returns true as word "apple" is found
        System.out.println(matcher1.start()); // prints 11 as the start index of word "apple"
        System.out.println(matcher1.end()); // prints 16 as the end index of word "apple"
    }
}
