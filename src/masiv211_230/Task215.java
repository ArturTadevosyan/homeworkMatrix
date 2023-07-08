package masiv211_230;

public class Task215 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -6, -7, 5, 9, 44, 5, -15, 66, 54};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("number " + i + " index = " + arr[i]);
                sum = sum + arr[i];
            }
        }

        System.out.println("answer = " + sum);

    }
}