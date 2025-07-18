// Merge Sort
import java.util.*;
public class mergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged [] = new int[ei-si+1];

        int index1 = si;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid && index2 <= ei) {
            if(arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while(index1 <= mid) {
            merged[x++] = arr[index1++];
        }

        while(index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        for(int i=0; i<merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr [] = new int [size];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter element at place " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        } 
        System.out.println("Original array: " + Arrays.toString(arr));

        divide(arr, 0, size-1);

        // print
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}