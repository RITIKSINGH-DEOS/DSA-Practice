public class GridWays {

    public static int gridWays(int i, int j, int n, int m) {

        // Base case: destination par pahunch gaye
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Grid ke bahar chale gaye
        if (i == n || j == m) {
            return 0;
        }

        // Right jaana
        int right = gridWays(i, j + 1, n, m);

        // Down jaana
        int down = gridWays(i + 1, j, n, m);

        return right + down;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 3;

        System.out.println(gridWays(0, 0, n, m));
    }
}