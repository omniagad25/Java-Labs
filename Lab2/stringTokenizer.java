import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("No input found");
            return;
        }
        int len= args.length;
            int count=0;
            String word= args[len-1];
            for (int i=0; i<len-1;i++ ) {
                StringTokenizer tokenizer = new StringTokenizer(args[i]);
                while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                if (token.equals(word)) {
                    count++;
                }
            }

            }
            System.out.println("The count of mentioning the word in the sentence is: "+ count);
        
            
    }
}
