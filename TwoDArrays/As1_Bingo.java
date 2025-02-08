
package src.TwoDArrays;


public class As1_Bingo {

    public static void run() {

        char[] allLetters = {'B', 'I', 'N', 'G', 'O'};

        int[][] bingoArray = new int[5][5];

        bingoArray[0] = generateArray(5, 1, 15);
        bingoArray[1] = generateArray(5, 16, 30);
        bingoArray[2] = generateArray(5, 31, 45);
        bingoArray[3] = generateArray(5, 46, 60);
        bingoArray[4] = generateArray(5, 61, 75);

        printBingo(bingoArray);

        while (true) {

            String choice = Library.input.nextLine();

            if (choice.equals("")) {
                int randomNum = myRandom(1, 75);
                System.out.println("The number chosen is " + randomNum);
                linearSearch(bingoArray, randomNum);

            }
            if (isWinner(bingoArray)) {
                System.out.println("BINGO!");
                break;
            }

        }


    }


    public static int[] generateArray(int length, int min, int max) {

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = myRandom(min, max);
        }

        return result;


    }


    public static int myRandom(int min, int max) {
        int num = (int) (Math.random() * (max - min + 1) + min);
        return num;
    }

    public static void printBingo(int[][] grid) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (grid[row][col] == 0) {
                    System.out.print("_ ");
                } else {
                    System.out.print(grid[row][col] + " ");
                }

            } // col
            System.out.println();
        } // row
    }// printBingo


    public static boolean checkRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] grid, int colNumber   ) {

        for (int row = 0; row < 5; row++) {
            if (grid[row][colNumber] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void linearSearch(int[][] arr, int searchTerm) {
        boolean found = false;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (arr[row][col] == searchTerm) {
                    arr[row][col] = -arr[row][col];
                    found = true;
                }
            }
        }
        if (found) {
            System.out.println("Found");
            printBingo(arr);


        } else {
            System.out.println("Not found");
        }
    }

    public static boolean isWinner(int[][] bingoArray) {

        for (int row = 0; row < 5; row++) {
            if (checkRow(bingoArray[row])) {
                return true;
            }
        }

        for (int col = 0; col < 5; col++) {
            if (checkColumn(bingoArray, col)) {
                return true;
            }
        }

        return false;
    }
}
