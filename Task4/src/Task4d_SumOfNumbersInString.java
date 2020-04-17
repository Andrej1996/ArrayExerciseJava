import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        String text;
        System.out.println("Enter text: ");
        text = one.nextLine();

        int result = 0;
        for ( int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            if (Character.isDigit(character)) {
                result = result + Character.getNumericValue(character);
            }
        }
        System.out.println(result);
    }
}
