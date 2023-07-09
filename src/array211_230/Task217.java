package array211_230;

public class Task217 {
    public static void main(String[] args) {
        long[] arr = {16, 7, -6, -7, 5, 9, 44, 5, -15, 66, 54};

        long sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println("number " + i + " index = " + arr[i]);
                sum = sum * arr[i] * arr[i];
            }
        }

        System.out.println("answer = " + sum);

    }
}