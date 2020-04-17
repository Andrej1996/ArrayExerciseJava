import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);


        String sentence;
        System.out.println("Enter a string: ");
        sentence = one.nextLine();
        int word = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ' )
            word++;
        }
        System.out.println("Your sentence have " + word + " words.");

    }
}
