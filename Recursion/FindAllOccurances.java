
import java.util.*;

public class FindAllOccurrences {

    public static void findOccurrences(int arr[], int key, int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        findOccurrences(arr, key, index + 1);
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        findOccurrences(arr, key, 0);
    }
}