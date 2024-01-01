import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("No input found");
            return;
        }
        int len = args.length;
        int count = 0;
        String word = args[len - 1];
        String regex = "\\b" + Pattern.quote(word) + "\\b";
        for (int i = 0; i < len - 1; i++) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(args[i]);

            // Count occurrences
            while (matcher.find()) {
                count++;
            }

        }
        System.out.println("The count of mentioning the word in the sentence is: " + count);
    }
}
    