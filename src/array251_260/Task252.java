package array251_260;

public class Task252 {
    public static void main(String[] args) {
        int[] array = {16, 7, -6, -7, 5, 9, 44, 5, -10, 66, 54};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(" min = " + min);

    }
}
