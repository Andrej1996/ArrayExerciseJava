import java.util.Scanner;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);

        int number;
        System.out.println("Enter number of person: ");
        number = one.nextInt();

        String[] fname = new String[number];
        for (int i = 0; i < fname.length; i++) {
            System.out.println("Enter first name: ");
            fname[i] = one.next();
        }
        String[] lname = new String[number];
        for (int i = 0; i < lname.length; i++) {
            System.out.println("Enter last name: ");
            lname[i] = one.next();
        }

        int[] age = new int[number];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age: ");
            age[i] = one.nextInt();
        }

        int[] weight = new int[number];
        for (int i = 0; i < weight.length; i++) {
            System.out.println("Enter weight: ");
            weight[i] = one.nextInt();
        }

        int[] height = new int[number];
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter height: ");
            height[i] = one.nextInt();
        }

        String[] profession = new String[number];
        for (int i = 0; i < profession.length; i++) {
            System.out.println("Enter profession: ");
            profession[i] = one.next();
        }


        for (int i = 0; i < number ; i++) {
            System.out.print(fname[i]);
            System.out.print(" ");
            System.out.print(lname[i]);
            System.out.print(" is born ");
            System.out.print(age[i]);
            System.out.print(" year.");
            System.out.print(" His weight is ");
            System.out.print(weight[i]);
            System.out.print(" kg");
            System.out.print(" and he is ");
            System.out.print(height[i]);
            System.out.print(" cm tall.");
            System.out.print(" Hi is a ");
            System.out.print(profession[i]);
            System.out.println(".");
        }
    }
}
