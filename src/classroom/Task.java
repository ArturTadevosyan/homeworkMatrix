package classroom;

public class Task {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        array[0][0] = 5;
        array[0][1] = 1;
        array[0][2] = 3;
        array[1][0] = 9;
        array[1][1] = 2;
        array[1][2] = 8;
        array[2][0] = 1;
        array[2][1] = 7;
        array[2][2] = 0;

        System.out.println("--------------------------------");
        System.out.println("Մատրից 3x3 ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("| " + array[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        System.out.println("Մատրիցի հիմնական անկյունագիծ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print("| " + array[i][i] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        System.out.println("Մատրիցի երկրորդական անկյունագիծ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length - i - 1) {
                    System.out.print("| " + array[i][j] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Մատրիցի երկրորդական անկյունագիծ և դրանից աջ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= array.length - j - 1) {
                    System.out.print("| " + array[i][j] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }


        System.out.println("--------------------------------");
        System.out.println("Մատրիցի երկրորդական անկյունագիծ և դրանից ձախ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= array.length - j - 1) {
                    System.out.print("| " + array[i][j] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Մատրիցի հիմնական անկյունագիծ և դրանից աջ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j) {
                    System.out.print("| " + array[i][j] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        System.out.println("Մատրիցի հիմնական անկյունագիծ և դրանից ձախ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j) {
                    System.out.print("| " + array[i][j] + " | ");
                } else {
                    System.out.print("|   | ");
                }
            }
            System.out.println();
        }

    }
}
