package masiv211_230;

public class Task220 {
    public static void main(String[] args) {
        long[] arr = {16, 7, -6, -7, 5, 9, 44, 5, -15, 66, 54};

        int k = 5;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        System.out.println("answer positive count = " + countPositive);
        System.out.println("answer negative count = " + countNegative);

    }
}