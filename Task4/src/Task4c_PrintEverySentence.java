import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        String text;
        System.out.println("Enter text: ");
        text = one.next();

        String[] array = text.split("[.]");
        for (String a : array) {
            System.out.println(a + "." );
        }
        System.out.println();
        System.out.println();
    }
}
