public class Task0a_CreateArray {
    public static void main(String[] args) {

        int [] array = new int[7];
        array[0] = 5;
        array[1] = 9;
        array[2] = 11;
        array[3] = 3;
        array[4] = 6;
        array[5] = 4;
        array[6] = 7;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
