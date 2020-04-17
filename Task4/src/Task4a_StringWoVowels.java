import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String word = one.nextLine();
        char[] ch = word.toCharArray();
        char[] vowel = new char[100];
        int j = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e'|| ch[i] == 'i' || ch[i] == 'o'|| ch[i] == 'u' ){

            }
            else {
                vowel[j] = ch[i];
                j++;
            }
        }
        System.out.print("Text without vawels: ");
        System.out.println(vowel);
    }
}
