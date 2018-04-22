package com.company;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        longestIncreasingSubsequence();
    }
    private static void longestIncreasingSubsequence() {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        int longestSubsequnce[] = new int[n];
        for(int i = 0; i < n; i++) {
            longestSubsequnce[i] = 1;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i] > arr[j] && longestSubsequnce[i] < longestSubsequnce[j] +1) {
                    longestSubsequnce[i] = longestSubsequnce[j] + 1;
                }
            }
        }
        // A single loop traversal can work as well, just for making things easier! Not optimal thing.
        Arrays.sort(longestSubsequnce);
        System.out.println(longestSubsequnce[n - 1]);
    }
}
