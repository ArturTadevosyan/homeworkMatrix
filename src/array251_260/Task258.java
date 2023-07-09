package array251_260;

public class Task258 {
    public static void main(String[] args) {

        int[] array = {10, 7, -6, -7, 12, 120, 44, -10, 15, 66, 54};

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println("answer -> last max element index  = " + index + " |  element = " + array[index]);

    }
}
