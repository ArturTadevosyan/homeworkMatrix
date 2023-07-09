package array211_230;

public class Task228 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -6, 2, 5, 1, 9, 44, 5, -15, 66, 54};
        int k = 3;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                System.out.println("number " + i + " index = " + arr[i]);
                sum = sum + arr[i];
            }
        }

        System.out.println("answer = " + sum);

    }
}