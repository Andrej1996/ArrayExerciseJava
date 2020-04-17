import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = one.nextInt();
        int a[] = new int[number];

        int i;
        System.out.format("Enter %d numbers: ", number);

        for ( i = 0; i < a.length; i++) {
            a[i] = one.nextInt();
        }
        for (i = 0; i < a.length; i++){
            if (a[i] <= a.length || a[i] >= a.length) {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
