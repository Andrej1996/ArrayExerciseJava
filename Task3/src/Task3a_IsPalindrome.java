import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        String word;
        String a = "";
        System.out.println("Enter word: ");
        word = one.next();

        int lenght = word.length();

        for (int i = lenght - 1; i >= 0; i-- ) {
            a = a + word.charAt(i);

        }
        if (word.equals(a)) {
            System.out.println("The word '" + word + "' is palindrome.");
        } else {
            System.out.println("The word '" + word + "' is not palindrome.");
        }
    }
}
