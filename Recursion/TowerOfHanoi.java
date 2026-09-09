import java.util.*;

public class TowerOfHanoi {

    static Stack<Integer> A = new Stack<>();
    static Stack<Integer> B = new Stack<>();
    static Stack<Integer> C = new Stack<>();

    public static void towerOfHanoi(int n, Stack<Integer> source,
                                     Stack<Integer> helper,
                                     Stack<Integer> destination,
                                     char sourceName,
                                     char helperName,
                                     char destinationName) {

        if (n == 0) {
            return;
        }

        towerOfHanoi(
            n - 1,
            source,
            destination,
            helper,
            sourceName,
            destinationName,
            helperName
        );

        int disk = source.pop();
        destination.push(disk);

        System.out.println(
            "Shift disk " + disk +
            " from " + sourceName +
            " to " + destinationName
        );

        towerOfHanoi(
            n - 1,
            helper,
            source,
            destination,
            helperName,
            sourceName,
            destinationName
        );
    }

    public static void main(String[] args) {

        int n = 3;

        // Largest disk first, smallest disk on top
        for (int i = n; i >= 1; i--) {
            A.push(i);
        }

        towerOfHanoi(
            n,
            A,
            B,
            C,
            'A',
            'B',
            'C'
        );
    }
}