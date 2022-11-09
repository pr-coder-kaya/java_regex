import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_Matcher_Exercise_CountWords {
    public static void main(String[] args) {
        /*
        Assume you are given a sentence as below
        Count how many words has more than 4 characters

        Test data:
        Hello, I am practicing regex today

        Expected output:
        4
         */

        Pattern pattern = Pattern.compile("[a-zA-Z]{5,}");
        Matcher matcher = pattern.matcher("Hello, I am practicing regex today");

        int counter = 0;

        while(matcher.find()) counter++;

        System.out.println(counter);
    }
}
