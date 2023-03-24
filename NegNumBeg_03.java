// Move all negative numbers to beginning and positive to end with constant extra space

import java.util.*;

public class NegNumBeg_03 {

    static void reArrange(int arr[], int size) {
        int j = 0, temp;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int size = arr.length;
        printArray(arr, size);
        reArrange(arr, size);
        System.out.println();
        printArray(arr, size);
    }

}


/*Time Complexity: O(n*log(n)), Where n is the length of the given array.
Auxiliary Space: O(n) */
