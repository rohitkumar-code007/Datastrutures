import java.util.Arrays;

public class seabinary {

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5},
                       {9, 4, 8},
                       {6, 1, 7}};

        int[] maxIndex = findMaxIndex(arr);

        if (maxIndex[0] != -1) {
            System.out.println("The maximum number is located at index: " + Arrays.toString(maxIndex));
        } else {
            System.out.println("The array is empty or null.");
        }
    }

    /**
     * Finds the index (row and column) of the maximum element in a 2D array.
     *
     * @param arr The 2D integer array to search.
     * @return An array containing the row and column index, e.g., {row, col}.
     * Returns {-1, -1} if the array is null or empty.
     */
    static int[] findMaxIndex(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new int[]{-1, -1};
        }

        int max = arr[0][0];
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        return new int[]{rowIndex, colIndex};
    }
}