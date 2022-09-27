package Sorting;

import java.util.*;

public class selctionsort {
    static void sort(int arr[]) {
        for (int step = 0; step < arr.length - 1; step++) {
            int min_idx = step;
            for (int i = step + 1; i < arr.length; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

}
