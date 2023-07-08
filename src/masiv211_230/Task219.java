package masiv211_230;

public class Task219 {
    public static void main(String[] args) {
        long[] arr = {16, 7, -6, -7, 5, 9, 44, 5, -15, 66, 54};

        int k = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                System.out.println("number " + i + " index = " + arr[i]);
                count++;
            }
        }

        System.out.println("answer = " + count);

    }
}