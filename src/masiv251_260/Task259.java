package masiv251_260;

public class Task259 {
    public static void main(String[] args) {

        int[] array = {-5, 17, 0, -6, -7, 12, 9, 44, -10, 15, 66, 54};

        int min = array[0];
        int count = 0;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min && count == 0) {
                min = array[i];
                count++;
                index = i;
            }
        }

        System.out.println("answer -> first min element index  = " + index + " |  element = " + array[index]);

    }
}
