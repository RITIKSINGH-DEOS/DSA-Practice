public class SearchMatrix {

    public static boolean staircaseSearch(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0, j = m - 1;

        while (j >= 0 && i < n) {

            if (matrix[i][j] == key) {
                System.out.println("Found at (" + i + "," + j + ")");
                return true;
            }

            // Go down
            else if (matrix[i][j] < key) {
                i++;
            }

            // Go left
            else if (matrix[i][j] > key) {
                j--;
            }
        }

        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;

        staircaseSearch(matrix, key);
    }
}