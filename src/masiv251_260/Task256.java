package masiv251_260;

public class Task256 {
    public static void main(String[] args) {

        int[] array = {16, 7, -6, -7, 12, 9, 44, -10, 15, 66, 54};

        int min = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        System.out.println(" index = " + index + " | " + " max = " + min + " | answer = " + (index + min));

    }
}
