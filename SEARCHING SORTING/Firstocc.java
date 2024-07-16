import java.util.*;

public class Firstocc {
    public static int firstOccurrence(int[] arr, int key) {
        return binarySearchFirstOccurrence(arr, key, 0, arr.length - 1);
    }

    private static int binarySearchFirstOccurrence(int[] arr, int key, int st, int end) {
        if (st > end) {
            return -1;
        }

        int mid = st + (end - st) / 2;

        if (arr[mid] == key) {
            // Check if this is the first occurrence
            int firstOccurrenceInLeft = binarySearchFirstOccurrence(arr, key, st, mid - 1);
            return (firstOccurrenceInLeft == -1) ? mid : firstOccurrenceInLeft;
        } else if (arr[mid] < key) {
            return binarySearchFirstOccurrence(arr, key, mid + 1, end);
        } else {
            return binarySearchFirstOccurrence(arr, key, st, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        sc.close();

        int result = firstOccurrence(arr, key);
        System.out.println(result);
    }
}
