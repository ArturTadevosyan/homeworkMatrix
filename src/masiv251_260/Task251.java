package masiv251_260;

public class Task251 {
    public static void main(String[] args) {
        int[] array = {16, 7, -6, -7, 5, 9, 44, 5, 15, 66, 54};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(" max = " + max);
    }
}
