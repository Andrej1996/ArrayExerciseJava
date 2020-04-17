import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String word;
        System.out.println("Enter a word: ");
        word = one.next();

        word = word.toLowerCase();
        int lenght = word.length();
        char ch;
        int count = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            count = 0;
            for (int j = 0; j < lenght; j++) {
                ch = word.charAt(j);
                if (ch == i) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(i + "  (" + count + ")");
            }
        }
    }
}
