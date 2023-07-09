package array211_230;

public class Task222 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -6, -7, 5, 9, 44, 5, -15, 66, 54};

        int start = -25;
        int end = 5;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= start && arr[i] < end) {
                System.out.println("number " + i + " index = " + arr[i]);
                sum = sum * arr[i];
            }
        }

        System.out.println("answer = " + sum);

    }
}