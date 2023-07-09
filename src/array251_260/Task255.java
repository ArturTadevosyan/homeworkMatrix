package array251_260;

public class Task255 {
    public static void main(String[] args) {

        int[] array = {16, 7, -6, -7, 12, 9, 44, -10, 15, 66, 54};

        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(" index = " + index + " | " + " max = " + max + " | answer = " + (index + max));

    }
}
