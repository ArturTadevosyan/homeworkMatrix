package array211_230;

public class Task223 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -6, -7, 5, 1, 9, 44, 5, -15, 66, 54};

        int start = -25;
        int end = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > start && arr[i] < end) {
                System.out.println("number " + i + " index = " + arr[i]);
                count++;
            }
        }

        System.out.println("answer = " + count);

    }
}