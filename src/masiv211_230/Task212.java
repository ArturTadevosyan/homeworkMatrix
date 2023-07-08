package masiv211_230;

public class Task212 {
    public static void main(String[] args) {
        int[] arr = {16, 7, -6, -7, 5, 9, 44, 5, 15, 66, 54};


        int sum = 0;
        int countOfPositiveDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countOfPositiveDigit++;
                sum = sum + arr[i] * arr[i];
            }
        }

        System.out.println("answer = " + sum / countOfPositiveDigit);

    }
}