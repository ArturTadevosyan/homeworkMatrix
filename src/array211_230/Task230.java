package array211_230;

public class Task230 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -5, 2, 5, 1, 9, 44, 5, -15, 66, 54};

        int k = 5;
        int count = 0;
        long sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                System.out.println("number " + i + " index = " + arr[i]);
                sum = sum * arr[i] * arr[i];
                count++;
            }
        }

        System.out.println("answer = " + sum / count);

    }
}