import java.util.regex.Pattern;

public class _03_Regex_exercises {
    public static void main(String[] args) {
        /**
         * Checking if given String is following the SSN Format DDD-DD-DDDD
         */

        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000")); // true
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000 00 0000")); // false

        /**
         * Checking if given String is following the Phone Number Format (DDD) DDD-DDDD
         */

        System.out.println(Pattern.matches("\\([\\d]{3}\\) [\\d]{3}-[\\d]{4}", "(000) 000-0000")); // true
        System.out.println(Pattern.matches("\\([\\d]{3}\\) [\\d]{3}-[\\d]{4}", "(000)-000-0000")); // false
    }
}
