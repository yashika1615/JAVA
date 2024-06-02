package ARRAYS;

import java.util.*;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int y = 0; y < n; y++) {
            arr[y] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
        }
        System.out.println();
    }

}
