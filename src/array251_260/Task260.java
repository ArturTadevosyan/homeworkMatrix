package array251_260;

public class Task260 {
    public static void main(String[] args) {

        int[] array = {10, 7, -6, -7, 12, 120, 44, -10, 15, 66, -33, 54, -20};

        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        System.out.println("answer -> last min element index  = " + index + " |  element = " + array[index]);

    }
}
