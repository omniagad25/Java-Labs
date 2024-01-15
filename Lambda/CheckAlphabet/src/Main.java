public class Main {
    public static void main(String[] args) {
        String inputString = "HelloWorld";

        if (onlyAlphabets(inputString)) {
            System.out.println("Only alphabets.");
        } else {
            System.out.println("The input does not contain only alphabets.");
        }
    }

    private static boolean onlyAlphabets(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
}