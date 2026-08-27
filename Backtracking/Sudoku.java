import java.util.*;

public class Sudoku {

    // Check karta hai ki number rakh sakte hain ya nahi
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // Same column check
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Same row check
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Same 3x3 box check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solveSudoku(int sudoku[][], int row, int col) {

        // Saare cells complete ho gaye
        if (row == 9) {
            return true;
        }

        // Row complete hone par next row
        if (col == 9) {
            return solveSudoku(sudoku, row + 1, 0);
        }

        // Agar cell already filled hai
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, row, col + 1);
        }

        // Empty cell mein 1 se 9 tak try karo
        for (int digit = 1; digit <= 9; digit++) {

            if (isSafe(sudoku, row, col, digit)) {

                // Number place karo
                sudoku[row][col] = digit;

                // Aage solve karo
                if (solveSudoku(sudoku, row, col + 1)) {
                    return true;
                }

                // Galat choice thi -> Backtrack
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}