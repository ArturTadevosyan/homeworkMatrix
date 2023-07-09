package masiv251_260;

public class Task253 {
    public static void main(String[] args) {
        int[] array = {16, 7, -6, -7, 5, 9, 44, -10, 15, 66, 54};

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(" min = " + min + " | " + " max = " + max + " | answer = " + (min + max));

    }
}
