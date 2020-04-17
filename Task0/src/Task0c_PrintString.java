import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        String a;
        System.out.println("Enter some symbols: ");
        a = one.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}
