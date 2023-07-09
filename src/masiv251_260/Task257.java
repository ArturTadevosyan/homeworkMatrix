package masiv251_260;

public class Task257 {
    public static void main(String[] args) {

        int[] array = {10, 7, -6, -7, 12, 9, 44, -10, 15, 66, 54};

        int max = array[0];
        int count = 0;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max && count == 0) {
                max = array[i];
                count++;
                index = i;
            }
        }

        System.out.println("answer -> first max element index  = " + index + " |  element = " + array[index]);

    }
}
