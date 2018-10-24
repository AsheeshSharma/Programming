package com.company;

public class QuickSort {
    public static void main(String[] args) {

    }

    private static int partitionArray(int arr[], int low, int high) {
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] <= arr[high]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    private static void sort(int arr[], int low, int high) {
        while(low < high) {
            int partition = partitionArray(arr, low, high);
            sort(arr, low, partition - 1);
            sort(arr, partition + 1, high);
        }
    }
}
