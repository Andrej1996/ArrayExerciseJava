import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);

        String text;
        System.out.println("Enter a text: ");
        text = one.nextLine();
        String command;
        System.out.println("Enter a command: ");
        command = one.nextLine();

        char[] array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (command.equals("encode")) {
                if (array[i] == ' ' || array[i] == '.') {
                    System.out.print(array[i]);
                } else {
                    ++array[i];
                    System.out.print(array[i]);
                }
            }
            if (command.equals("decode")) {
                if (array[i] == ' ' || array[i] == '.') {
                    System.out.print(array[i]);
                } else {
                    --array[i];
                    System.out.print(array[i]);
                }
            }
        }
    }
}
